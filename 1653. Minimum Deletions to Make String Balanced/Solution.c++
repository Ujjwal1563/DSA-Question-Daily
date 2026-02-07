class Solution {
public:
    int minimumDeletions(string s) {
        int count = 0;
        int res = 0;
        for (int i = 0; i< s.size();i++){
            if(s[i] =='b'){
                count++;
            }
            else if(count){
                res++;
                count--;
            }
        }
        return res;
    }
};