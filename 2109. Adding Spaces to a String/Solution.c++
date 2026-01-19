class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        string ans = "";
        int n = s.size();
        int m = spaces.size();
        int j = 0, i = 0;

        while (j < m && i<n) {
            if(spaces[j]==i){
                ans+=" ";
                j++;
            }
            ans+=s[i];
            i++;
        }
        if(i<n){
            while(i<n){
                ans+=s[i];
                i++;
            }
        }
        return ans;
    }
};