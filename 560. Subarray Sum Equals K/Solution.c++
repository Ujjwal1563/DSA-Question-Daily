class Solution {
public:
    int subarraySum(vector<int>& arr, int k) {
        int ans = 0;
        map<int,int>mpp;
        mpp[0]=1;
        int preSum=0;
        for (int i =0;i<arr.size();i++){
            preSum+=arr[i];
            int remove = preSum-k;
            ans+=mpp[remove];
            mpp[preSum]++;
        }
        return ans;
    }
};