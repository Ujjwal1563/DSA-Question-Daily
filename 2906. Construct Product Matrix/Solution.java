class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m][n];
        int[][] xx = new int[m][n];
        int[][] yy = new int[m][n];

        long product = 1;
        int mod = 12345;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                xx[i][j] = (int) product;
                product = (product * grid[i][j]) % mod;
            }
        }
        product = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                yy[i][j] = (int) product;
                product = (product * grid[i][j]) % mod;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long mul = (long) xx[i][j] * yy[i][j];
                ans[i][j] = (int) (mul % mod);
            }
        }

        return ans;
    }
}
