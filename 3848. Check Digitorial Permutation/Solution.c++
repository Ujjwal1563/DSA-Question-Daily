class Solution {
public:
    int factorial(int n){
        int fact[10] = {1};
            fact[0] = 1;
            for (int i =1; i<= 9;i++){
                fact[i] = fact[i - 1]* i;
            }
        return fact[n];
    }
    bool isDigitorialPermutation(int n) {
        int sum = 0;
        int num =n;
        map<int,int>mp;
        while(n>0){
            int digit = n%10;
            mp[digit]++;
            sum += factorial(digit);
            n = n/10;
        }
        int sum1 = sum;
        while(sum1 >0){
            int digit = sum1%10;
            mp[digit]--;
            sum1=sum1/10;
        }
        for (auto [freq, count]: mp){
            if(count !=0){
                return false;
            }
        }
        // if(num == sum)return true;
        // else return false;
        return true;
    }
};