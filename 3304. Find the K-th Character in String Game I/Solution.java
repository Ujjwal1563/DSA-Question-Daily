class Solution {
    public char kthCharacter(int k) {
        StringBuilder ans = new StringBuilder("a");
        while (ans.length() < k){
            int size = ans.length();
            for(int i = 0; i < size; i++){
                ans.append((char)('a' + ((ans.charAt(i) - 'a') + 1) % 26));
            }
        }
        return ans.charAt(k-1);
    }
}