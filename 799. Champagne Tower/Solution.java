class Solution {
    double[][] dp = new double[101][101];
    public double solve(int poured, int i, int j) {
        if (i < 0 || j < 0 || i < j) {
            return 0.0;
        }
        if (i == 0 && j == 0) {
            return poured;
        }
        if (dp[i][j] != -1.0) {
            return dp[i][j];
        }
        double left = (solve(poured, i - 1, j - 1) - 1) / 2.0;
        double right = (solve(poured, i - 1, j) - 1) / 2.0;
        if (left < 0) left = 0.0;
        if (right < 0) right = 0.0;
        dp[i][j] = left + right;
        return dp[i][j];
    }
    public double champagneTower(int poured, int query_row, int query_glass) {
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                dp[i][j] = -1.0;
            }
        }
        return Math.min(1.0, solve(poured, query_row, query_glass));
    }
}
