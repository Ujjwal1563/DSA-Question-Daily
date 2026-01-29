class Solution {
public:
    bool canConstruct(string s, int k) {
        if(s.length()<k)return false;
        sort (s.begin(),s.end());
        int oddcount = 0;
        for (int i =0 ;i<s.size();){
            int count = 0;
            char ch = s[i];
            while ( i< s.size() && ch==s[i]){
                count ++;
                i++;
            }
            if (count % 2 != 0)oddcount ++;
        }
        return (oddcount<=k);
    }
};