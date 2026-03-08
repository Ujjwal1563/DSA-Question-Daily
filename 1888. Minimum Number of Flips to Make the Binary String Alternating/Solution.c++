class Solution {
public:
    int minFlips(string s) {
        int n = s.size();
        int result = INT_MAX;
        int f1 = 0;
        int f2 = 0;
        int i = 0, j = 0;
        while (j < 2 * n) {
            char s1 = j % 2 ? '0' : '1';
            char s2 = j % 2 ? '1' : '0';
            if (s[j % n] != s1) {
                f1++;
            }
            if (s[j % n] != s2) {
                f2++;
            }
            if (j - i + 1 > n) {
                s1 = i % 2 ? '0' : '1';
                s2 = i % 2 ? '1' : '0';
                if (s[i % n] != s1) {
                    f1--;
                }
                if (s[i % n] != s2) {
                    f2--;
                }
                i++;
            }
            if( j - i + 1== n){
                result = min({result, f1, f2});
            }
            j++;
        }
        return result;
    }
};