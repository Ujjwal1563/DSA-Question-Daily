class Solution {
public:
    bool checkOnesSegment(string s) {
        int count = 0;
        vector<int> res;
        for (int i =0; i< s.size();i++){
            if(s[i] == '1'){
                count++;
            }
            if(s[i] == '0'){
                if(count){
                res.push_back(count);
                }
                count = 0;
            }
        }
        if(count){
        res.push_back(count);
        }
        if(res.size() ==1) return true;
        return false;
    }
};