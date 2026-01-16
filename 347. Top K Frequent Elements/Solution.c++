class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int>ans;
        for (int i =0;i<nums.size();i++){
            ans[nums[i]]++;
        }
        vector<pair<int,int>>freq(ans.begin(),ans.end());
        sort(freq.begin(),freq.end(),[](auto &a,auto &b){
            return a.second>b.second;
        });
        vector<int > res ;
        for(int i =0;i<k;i++){
            res.push_back(freq[i].first);
        }
        return res;
    }
};