class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avgTime = 0;
        int totalTime =customers[0][0];
        for (int i =0 ;i<customers.length;i++){
            
            if(totalTime<customers[i][0]){
                totalTime=customers[i][0]+customers[i][1];
            }
            else {
            totalTime+=customers[i][1];
            }
            avgTime+=(totalTime-customers[i][0]);
        }
        return avgTime/customers.length;
    }
}