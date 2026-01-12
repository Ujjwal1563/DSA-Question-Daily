class Solution {
public:
    int calPoints(vector<string>& arr) {
        stack<int>st ;
        for (int i=0;i<arr.size();i++){
            if(arr[i]=="C")st.pop();
            else if (arr[i]=="D")st.push(2*st.top());
            else if (arr[i]=="+"){
                int top=st.top();
                st.pop();
                int sum = top+st.top();
                st.push(top);
                st.push(sum);
            }
            else {
                st.push(stoi(arr[i]));
            }
        }
        int sum=0;
        while(!st.empty()){
            sum+=st.top();
            st.pop();
        }
        return sum;
    }
};