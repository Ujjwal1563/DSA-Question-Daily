class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0;
        int j = 0;
        int n = Math.min(word1.length(), word2.length());
        while (i < n && j < n) {
            ans += word1.charAt(i++);
            ans += word2.charAt(j++);
        }
        while (word1.length() < word2.length() && j < word2.length()) {
            ans += word2.charAt(j++);
        }
        while (word1.length() > word2.length() && i < word1.length()) {
            ans += word1.charAt(i++);
        }
        return ans;
    }
}