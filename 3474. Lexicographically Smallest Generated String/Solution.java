class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        
        char[] ans = new char[n + m - 1];
        
        // Initialize with '?'
        for (int i = 0; i < ans.length; i++) {
            ans[i] = '?';
        }

        // Handle 'T'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != 'T') continue;

            for (int j = 0; j < m; j++) {
                char v = ans[i + j];
                if (v != '?' && v != str2.charAt(j)) {
                    return "";
                }
                ans[i + j] = str2.charAt(j);
            }
        }

        // Store previous state
        char[] prev = ans.clone();

        // Replace remaining '?' with 'a'
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '?') {
                ans[i] = 'a';
            }
        }

        // Handle 'F'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != 'F') continue;

            String sub = new String(ans, i, m);
            if (!sub.equals(str2)) continue;

            boolean ok = false;

            for (int j = i + m - 1; j >= i; j--) {
                if (prev[j] == '?') {
                    ans[j] = 'b';
                    ok = true;
                    break;
                }
            }

            if (!ok) return "";
        }

        return new String(ans);
    }
}
