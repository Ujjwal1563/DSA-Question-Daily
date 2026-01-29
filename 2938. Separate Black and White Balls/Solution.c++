class Solution {
public:
    long long minimumSteps(string s) {
        long  res  = 0;
        long swap = 0;
        for (int i = 0;i <  s.size();i++){
            if(s[i]=='0'){
                res+=swap; 
            }
            else {
                swap++;
            }
        }
        return res;
    }
};