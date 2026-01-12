class Solution {
    public boolean isValid(String s) {
        Stack<Character>st= new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                char last = st.peek();
                if(last == '(' && ch==')')st.pop();
                else if(last == '{' && ch=='}')st.pop();
                else if(last == '[' && ch==']')st.pop();
                else st.push(ch);
            }
            else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}