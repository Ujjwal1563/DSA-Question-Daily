class Solution {
    public String maximumXor(String s, String t) {
        int n = s.length();
        int ones = 0;

        // Count number of '1's in t
        for (char c : t.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        int zeros = n - ones;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (ones > 0) {
                    result.append('1');
                    ones--;
                } else {
                    result.append('0');
                    zeros--;
                }
            } else {
                if (zeros > 0) {
                    result.append('1');
                    zeros--;
                } else {
                    result.append('0');
                    ones--;
                }
            }
        }

        return result.toString();
    }
}
