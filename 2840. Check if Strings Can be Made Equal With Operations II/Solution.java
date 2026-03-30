import java.util.*;

class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        
        StringBuilder s1even = new StringBuilder();
        StringBuilder s1odd = new StringBuilder();
        StringBuilder s2even = new StringBuilder();
        StringBuilder s2odd = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1even.append(s1.charAt(i));
                s2even.append(s2.charAt(i));
            } else {
                s1odd.append(s1.charAt(i));
                s2odd.append(s2.charAt(i));
            }
        }
        
        char[] s1e = s1even.toString().toCharArray();
        char[] s2e = s2even.toString().toCharArray();
        char[] s1o = s1odd.toString().toCharArray();
        char[] s2o = s2odd.toString().toCharArray();
        
        Arrays.sort(s1e);
        Arrays.sort(s2e);
        Arrays.sort(s1o);
        Arrays.sort(s2o);
        
        return Arrays.equals(s1e, s2e) && Arrays.equals(s1o, s2o);
    }
}
