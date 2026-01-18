class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int totalGas = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            totalcost += cost[i];
            totalGas += gas[i];
        }
        if (totalcost > totalGas) {
            return -1;
        }
        int curr = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            
            curr = curr + (gas[i] - cost[i]);
            if (curr < 0) {
                curr=0;
                flag=i+1;
            }
        }
        return flag;
    }
}