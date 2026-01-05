class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int least = prices[0];
        for (int i =1;i<prices.length;i++){
            if(prices[i]<least){
                least = prices[i];
            }
            if(prices[i]-least>0){
                maxPro+=prices[i]-least;
                least = prices[i];
            }
        }
        return maxPro;
    }
}