class Solution {
public:
    bool isValid(string s) {
        stack<int>st ;
        for (int i=0;i<s.size();i++){
            char cur = s[i];
            if(!st.empty()){
            char ch = st.top();
            if(ch=='('&&cur==')')st.pop();
            else if(ch=='{'&&cur=='}')st.pop();
            else if(ch=='['&&cur==']')st.pop();
            else {
                st.push(cur);
            }
            }
            else {
                st.push(cur);
            }
        }
        return st.empty();
    }
};