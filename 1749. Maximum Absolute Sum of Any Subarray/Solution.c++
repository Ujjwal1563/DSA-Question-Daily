class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int ans = 0,ans1 = 0;
        int sum = 0;
        for (int i =0;i<nums.size();i++){
            sum += nums[i];
            if(sum > ans) ans = sum;
            if(sum < ans1) ans1 = sum;
        }
        return abs(ans-ans1);
    }
};