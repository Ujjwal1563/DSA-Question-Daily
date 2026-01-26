class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
      sort(arr.begin(),arr.end());
      int minimum_diff = INT_MAX;
      for (int i =0;i<arr.size()-1;i++){
        minimum_diff = min(minimum_diff,abs(arr[i]-arr[i+1])); 
      } 
      vector<vector<int>>ans;
      for(int i =0 ;i<arr.size()-1;i++){
        if(minimum_diff == abs(arr[i]-arr[i+1])){
            ans.push_back({arr[i],arr[i+1]});
        }
      }
      return ans; 
    }
};