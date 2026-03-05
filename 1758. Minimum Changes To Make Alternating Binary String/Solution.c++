class Solution {
public:
    int minOperations(string s) {
        int res = 0,res2 = 0;
        for (int i = 0; i < s.size(); i++){
            char ch1 = (i%2==0)? '0' : '1';
            char ch2 = (i%2==0)? '1' : '0';
            if(s[i] != ch1) res++;
            if(s[i] != ch2) res2++;
        }
        return min(res,res2);
    }
};