class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0,ans1 = 0;
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            sum += nums[i];
            if(sum > ans) ans = sum;
            if(sum < ans1) ans1 = sum;
        }
        return Math.abs(ans-ans1);
    }
}