class Solution {
public:
    int minRemoval(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int i = 0;
        int j = 0;
        int diff = 1;
        int n = nums.size();
        int maxEle = nums[0];
        int minEle = nums[0];
        while(j < n){
            minEle = nums[i];
            maxEle = nums[j];
            while(i < j && maxEle > (long long)k * minEle){
                i++;
                minEle = nums[i];
            }
            diff = max(diff, j - i + 1);
            j++;
        } 

        return n - diff;
    }
};