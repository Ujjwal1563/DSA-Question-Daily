class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minimumDiff = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            minimumDiff = Math.min(minimumDiff, Math.abs(arr[i] - arr[i + 1]));
        }
        for (int i = 0; i < n - 1; i++) {
            if (minimumDiff == Math.abs(arr[i] - arr[i + 1])) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}