class Solution {
public:
    bool hasAlternatingBits(int n) {
        int one = 0;
        int zero = 0;
        while(n > 0){
            int bit = n&1;
            if(bit == 0){
                zero++;
                one =0;
                if(zero > 1){
                    return false;
                }
            }
            else {
                one++;
                zero = 0;
                if(one > 1){
                    return false;
                }
            }
            n = n>>1;
        }
        return true;
    }
};