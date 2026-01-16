class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n = nums.size();
        int checkMinFreq= n/3;
        map<int,int> mp;
        for ( int i : nums){
            mp[i]++;
        }
        vector<int>ans;
        for (auto it : mp){
            if(it.second>checkMinFreq){
                ans.push_back(it.first);
            }
        }
        return ans;
    }
};