class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        vector<pair<double,int>> ans ;
        for (int i =0;i<boxTypes.size();i++){
            ans.push_back({boxTypes[i][1],boxTypes[i][0]});
        }
        sort(ans.begin(),ans.end());
        int boxCount=truckSize;
        int totalunit=0;
        for (int i=boxTypes.size()-1 ;i>=0;i--){
            if(boxCount>=ans[i].second){
                totalunit+=ans[i].first*ans[i].second;
                boxCount-=ans[i].second;
                // break;
            }
            else {
                totalunit+=ans[i].first*(boxCount);
                boxCount=0;
            }
            cout <<ans[i].first<<" "<<ans[i].second<<" ";
            
        }
        return totalunit;
    }
};