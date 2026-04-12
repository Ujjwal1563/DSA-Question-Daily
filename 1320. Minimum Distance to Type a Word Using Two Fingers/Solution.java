class Solution {

    public int getDist(int a, int b) {
        if (a == -1) return 0;
        int r1 = a / 6, c1 = a % 6;
        int r2 = b / 6, c2 = b % 6;
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

    public int minimumDistance(String word) {
        int n = word.length();

        int[] dp = new int[26];
        int total = 0, save = 0;

        for (int i = 0; i < n - 1; i++) {
            int a = word.charAt(i) - 'A';
            int b = word.charAt(i + 1) - 'A';

            int dist = getDist(a, b);
            total += dist;

            int[] newDp = dp.clone();

            for (int j = 0; j < 26; j++) {
                newDp[a] = Math.max(newDp[a], dp[j] + dist - getDist(j, b));
            }

            dp = newDp;
        }

        for (int x : dp) {
            save = Math.max(save, x);
        }

        return total - save;
    }
}
