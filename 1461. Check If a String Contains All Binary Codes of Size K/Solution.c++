class Solution {
public:
    bool hasAllCodes(string s, int k) {
        unordered_set<string> st;
        if(k > s.size()) return false;
        for (int i =0 ;i <= s.size() - k ;i++){
            string str = s.substr(i, k);
            st.insert(str);
        }
        return st.size() == pow(2,k);
    }
};