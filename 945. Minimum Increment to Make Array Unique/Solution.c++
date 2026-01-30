class Solution {
public:
    int minIncrementForUnique(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ans = 0;
        int need = 0;
        for (int i = 0 ; i < nums.size() ; i++){
            ans += max(need - nums[i],0);
            need = max(need , nums[i]) + 1;
        }
        return ans;
    }
};