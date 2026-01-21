class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        double avgTime = 0;
        int totalTime =customers[0][0];
        for (int i =0 ;i<customers.size();i++){
            
            if(totalTime<customers[i][0]){
                totalTime=customers[i][0]+customers[i][1];
            }
            else {
            totalTime+=customers[i][1];
            }
            avgTime+=(totalTime-customers[i][0]);
            cout<<totalTime<<" "<<avgTime<<endl;
        }
        return avgTime/customers.size();
    }
};