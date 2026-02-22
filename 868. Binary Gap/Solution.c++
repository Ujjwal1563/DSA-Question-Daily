class Solution {
public:
    int binaryGap(int n) {
        int maximum = 0;
        int count = 1;
        int ones = 0;
        while(n>0){
            int bit = n & 1;
            if(bit == 1 && ones){
                maximum = max(count, maximum);
                count = 1;
                ones ++;
            }
            else if(bit == 1){
                count = 1;
                ones ++;
            }
            else{
            count++;
            }
            n = n>>1;
        }
        if(ones > 1){
           return maximum; 
        }
        return 0;
    }
};