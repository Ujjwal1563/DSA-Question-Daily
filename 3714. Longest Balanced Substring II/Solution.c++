class Solution {
public:
    int helper(string& s, int ch1, int ch2) {
        int n = s.size();
        unordered_map<int, int> diffmap;
        int count1 = 0;
        int count2 = 0;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] != ch1 && s[i] != ch2) {
                diffmap.clear();
                count1 = 0;
                count2 = 0;
                continue;
            }
            if (s[i] == ch1) {
                count1++;
            }
            if (s[i] == ch2) {
                count2++;
            }
            if (count1 == count2) {
                longest = max(longest, count1 + count2);
            }
            int diff = count1 - count2;
            if (diffmap.count(diff)) {
                longest = max(longest,i- diffmap[diff]);
            } else {
                diffmap[diff] = i;
            }
        }
        return longest;
    }
    int longestBalanced(string s) {
        int n = s.size();
        int longest = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s[i] == s[i - 1]) {
                count++;
            } else {
                longest = max(longest, count);
                count=1;
            }
        }
        longest = max(longest, count);
        longest = max(longest, helper(s, 'a', 'b'));
        longest = max(longest, helper(s, 'a', 'c'));
        longest = max(longest, helper(s, 'b', 'c'));
        int countA = 0;
        int countB = 0;
        int countC = 0;
        unordered_map<string, int> mp;
        for (int i = 0; i < n; i++) {
            if (s[i] == 'a')
                countA++;
            if (s[i] == 'b')
                countB++;
            if (s[i] == 'c')
                countC++;
            if(countA == countB && countA == countC){
                longest = max(longest, countA + countB + countC);
            }
            int diffAB = countA-countB;
            int diffAC = countA-countC;
            string key = to_string(diffAB) + "_"+to_string(diffAC);
            if(mp.count(key)){
                longest = max(longest, i - mp[key]);
            }
            else{
                mp[key] = i;
            }
        }
        return longest;
    }
};