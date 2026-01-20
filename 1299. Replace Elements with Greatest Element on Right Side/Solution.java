class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int large = -1 ;
        int n = arr.size();
        vector<int>ans(n);
        for (int i = n-1;i>=0;i--){
            if(arr[i]>large){
                ans[i]=large;
                large = arr[i];
            }
            else {
                ans[i]=large;
            }
        }
        return ans;
    }
};