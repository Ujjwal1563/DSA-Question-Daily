class Solution {
    public int minOperations(String s) {
        int res = 0, res2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch1 = (i % 2 == 0) ? '0' : '1';
            char ch2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != ch1) res++;
            if (s.charAt(i) != ch2) res2++;
        }

        return Math.min(res, res2);
    }
}