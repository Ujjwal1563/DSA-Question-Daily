class Solution {

    public int reverseInt(int x) {
        long r = 0;
        while (x > 0) {
            r = r * 10 + (x % 10);
            x /= 10;
        }
        return (int) r;
    }

    public int minMirrorPairDistance(int[] nums) {
        int[] mirror = nums.clone();
        Map<Integer, Integer> idx = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < mirror.length; i++) {
            int curr = mirror[i];
            int rev = reverseInt(curr);

            if (idx.containsKey(curr)) {
                ans = Math.min(ans, Math.abs(i - idx.get(curr)));
            }

            idx.put(rev, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
