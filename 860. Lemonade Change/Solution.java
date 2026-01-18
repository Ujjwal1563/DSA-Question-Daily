class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        Boolean flag = true;
        for (int i =0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            if(bills[i]==10){
                ten++;
                if(five>=1){
                five--;
                }
                else {
                    return false;
                }
            }
            if(bills[i]==20){
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}