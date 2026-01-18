public class Solution {
    
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int total =0;
        for(int i =0;i<n;i++){
            total+=nums[i];
        }
        int currSum=nums[0];
        int minSum=nums[0];
        for (int i =1;i<n;i++){
            currSum=Math.min(currSum+nums[i],nums[i]);
            minSum=Math.min(minSum,currSum);
        }
        currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<n;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        int circular = total-minSum;
        if(maxSum>0){
            return Math.max(maxSum,circular);
        }
        return maxSum;
    }
}