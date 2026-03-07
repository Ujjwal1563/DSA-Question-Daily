class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int result = Integer.MAX_VALUE;
        int f1 = 0, f2 = 0;
        int i = 0, j = 0;
        while (j < 2 * n) {
            char s1 = (j % 2 == 1) ? '0' : '1';
            char s2 = (j % 2 == 1) ? '1' : '0';
            if (s.charAt(j % n) != s1) {
                f1++;
            }
            if (s.charAt(j % n) != s2) {
                f2++;
            }
            if (j - i + 1 > n) {
                s1 = (i % 2 == 1) ? '0' : '1';
                s2 = (i % 2 == 1) ? '1' : '0';
                if (s.charAt(i % n) != s1) {
                    f1--;
                }
                if (s.charAt(i % n) != s2) {
                    f2--;
                }
                i++;
            }
            if (j - i + 1 == n) {
                result = Math.min(result, Math.min(f1, f2));
            }
            j++;
        }
        return result;
    }
}