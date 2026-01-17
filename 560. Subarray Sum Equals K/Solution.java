class Solution {
    public int subarraySum(int[] nums, int k) {
       int ans = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); 

        int preSum = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;

            if (mpp.containsKey(remove)) {
                ans += mpp.get(remove);
            }

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return ans; 
    }
}