class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();
        int i = n - 1;
        for (; i >= 0;) {
            if(s.charAt(i)==' '){
                i--;
            }
            else {
                break;
            }
        }
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}