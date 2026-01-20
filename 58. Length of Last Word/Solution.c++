class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        int n = s.size();
        int i = n - 1;
        for (; i >= 0;) {
            if (s[i] == ' ') {
                i--;
            } else {
                break;
            }
        }
        for (; i >= 0; i--) {
            if (s[i] == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
};
