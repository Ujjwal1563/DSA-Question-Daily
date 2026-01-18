class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
         int n = nums.size();
        int total =0;
        for(int i =0;i<n;i++){
            total+=nums[i];
        }
        int currSum=nums[0];
        int minSum=nums[0];
        for (int i =1;i<n;i++){
            currSum=min(currSum+nums[i],nums[i]);
            minSum=min(minSum,currSum);
        }
        currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<n;i++){
            currSum=max(currSum+nums[i],nums[i]);
            maxSum=max(maxSum,currSum);
        }
        int circular = total-minSum;
        if(maxSum>0){
            return max(maxSum,circular);
        }
        return maxSum;
    }
};