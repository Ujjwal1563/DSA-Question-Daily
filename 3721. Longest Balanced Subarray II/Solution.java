class SegmentTree {
    int n;
    int size;
    int[] sum;
    int[] mn;
    int[] mx;
    SegmentTree(int n) {
        this.n = n;
        this.size = 4 * n;
        sum = new int[size];
        mn = new int[size];
        mx = new int[size];
    }
    void pull(int node) {
        int left = node * 2;
        int right = node * 2 + 1;
        sum[node] = sum[left] + sum[right];
        mn[node] = Math.min(mn[left], sum[left] + mn[right]);
        mx[node] = Math.max(mx[left], sum[left] + mx[right]);
    }
    void update(int idx, int val) {
        int node = 1;
        int l = 0, r = n - 1;
        List<Integer> path = new ArrayList<>();
        while (l != r) {
            path.add(node);
            int m = l + (r - l) / 2;
            if (idx <= m) {
                node = node * 2;
                r = m;
            } else {
                node = node * 2 + 1;
                l = m + 1;
            }
        }
        sum[node] = val;
        mn[node] = val;
        mx[node] = val;
        for (int i = path.size() - 1; i >= 0; i--) {
            pull(path.get(i));
        }
    }
    int findRightmostPrefix(int target) {
        int node = 1;
        int l = 0, r = n - 1;
        int sumBefore = 0;
        if (!exist(node, sumBefore, target)) return -1;
        while (l != r) {
            int m = l + (r - l) / 2;
            int left = node * 2;
            int right = node * 2 + 1;
            int sumBeforeRight = sum[left] + sumBefore;
            if (exist(right, sumBeforeRight, target)) {
                node = right;
                l = m + 1;
                sumBefore = sumBeforeRight;
            } else {
                node = left;
                r = m;
            }
        }
        return l;
    }
    private boolean exist(int node, int sumBefore, int target) {
        return mn[node] <= target - sumBefore &&
               target - sumBefore <= mx[node];
    }
}
class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        SegmentTree stree = new SegmentTree(n);
        Map<Integer, Integer> first = new HashMap<>();
        int result = 0;
        for (int l = n - 1; l >= 0; l--) {
            int num = nums[l];
            if (first.containsKey(num)) {
                stree.update(first.get(num), 0);
            }
            first.put(num, l);
            stree.update(l, (num % 2 == 0) ? 1 : -1);
            int r = stree.findRightmostPrefix(0);
            if (r >= l) {
                result = Math.max(result, r - l + 1);
            }
        }
        return result;
    }
}
