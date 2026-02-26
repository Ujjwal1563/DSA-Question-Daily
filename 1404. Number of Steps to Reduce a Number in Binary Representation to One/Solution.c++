class Solution {
public:
    int numSteps(string s) {
        int count = 0, carry = 0;
        for(int i = s.length() - 1; i > 0; i--){
            if((s[i] - '0') + carry == 1){
                count += 2;
                carry = 1;
            }
            else {
                count++;
            }
        }
        return count + carry;
    }
};