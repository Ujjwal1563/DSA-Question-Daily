class Solution {
    private int helper(String s, char ch1, char ch2) {
        int n = s.length();
        Map<Integer, Integer> diffMap = new HashMap<>();
        int count1 = 0;
        int count2 = 0;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != ch1 && ch != ch2) {
                diffMap.clear();
                count1 = 0;
                count2 = 0;
                continue;
            }
            if (ch == ch1) count1++;
            if (ch == ch2) count2++;
            if (count1 == count2) {
                longest = Math.max(longest, count1 + count2);
            }
            int diff = count1 - count2;
            if (diffMap.containsKey(diff)) {
                longest = Math.max(longest, i - diffMap.get(diff));
            } else {
                diffMap.put(diff, i);
            }
        }
        return longest;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int longest = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }
        longest = Math.max(longest, count);
        longest = Math.max(longest, helper(s, 'a', 'b'));
        longest = Math.max(longest, helper(s, 'a', 'c'));
        longest = Math.max(longest, helper(s, 'b', 'c'));
        int countA = 0, countB = 0, countC = 0;
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') countA++;
            if (ch == 'b') countB++;
            if (ch == 'c') countC++;
            if (countA == countB && countA == countC) {
                longest = Math.max(longest, countA + countB + countC);
            }
            int diffAB = countA - countB;
            int diffAC = countA - countC;
            String key = diffAB + "_" + diffAC;
            if (mp.containsKey(key)) {
                longest = Math.max(longest, i - mp.get(key));
            } else {
                mp.put(key, i);
            }
        }
        return longest;
    }
}
