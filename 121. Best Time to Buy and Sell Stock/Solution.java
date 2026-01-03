class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int least = prices[0];
        for (int i =1;i<prices.length;i++){
            if(least>prices[i]){
                least = prices[i];
            }
            maxPro = Math.max(maxPro , prices[i]-least);
        }
        return maxPro;
    }
}