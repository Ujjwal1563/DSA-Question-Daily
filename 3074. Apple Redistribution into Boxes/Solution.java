class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i =0 ;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int total = 0;
        for(int i = capacity.length -1 ;i>=0;i--){
            total += capacity[i];
            if(sum<=total){
                int n = capacity.length;
                return n - i; 
            }
        }
        return 0;
    }
}