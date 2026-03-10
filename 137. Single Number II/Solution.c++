class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map<int,int> ans ;
        for(int num:nums){
            ans[num]++;
        }
        for (int num : nums){
            if(ans[num]==1){
                return num;
            }
        }
        return -1;
    }
};