class Solution {
public:
    char kthCharacter(int k) {
        string ans = "a";
        while (ans.size() < k){
            int n = ans.size();
            for (int i = 0 ; i < n;i++){
                ans+='a'+ (ans[i]-'a' +1)%26;
            }
        }
        return ans[k-1];
    }
};