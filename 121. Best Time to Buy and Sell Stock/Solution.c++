class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxPro = 0;
        int least = prices[0];
        for (int i = 1;i < prices.size();i++ ){
            if (least>prices[i]){
                least =prices[i];
            }
            maxPro= max(maxPro,prices[i]-least);
        }
        return maxPro;
    }
};