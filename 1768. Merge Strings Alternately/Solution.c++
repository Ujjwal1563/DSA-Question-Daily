class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string ans = "";
        int i = 0;
        int j = 0;
        int n = min(word1.size(), word2.size());
        while (i < n && j < n) {
            ans += word1[i++];
            ans += word2[j++];
        }
        while (word1.size() < word2.size() && j < word2.size()) {
            ans += word2[j++];
        }
        while (word1.size() > word2.size() && i < word1.size()) {
            ans += word1[i++];
        }
        return ans;
    }
};