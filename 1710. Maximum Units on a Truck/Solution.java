class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,Comparator.comparingInt(o->o[1]));
        int totalunit=0;
        for (int i=boxTypes.length-1;i>=0;i--){
            if(truckSize>=boxTypes[i][0]){
                totalunit+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];

            }
            else {
                totalunit+=boxTypes[i][1]*truckSize;
                truckSize=0;
            }
        }
        return totalunit;
    }
}