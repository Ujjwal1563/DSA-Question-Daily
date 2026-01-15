class Solution {
public:
    bool validPalindrome(string s) {
        int i = 0;
        int j = s.size()-1;
        while(i <= j){
            if(s[i]!=s[j]){
                return isPalinDrome(s,i+1,j) | isPalinDrome(s,i ,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    bool isPalinDrome(string s,int left ,int right){
        while(left<=right){
            if(s[left]!=s[right])return false;
            left++;
            right--;
        }
        return true;
    }
};