class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[] vertical = new long[n];
        long[] horizontal = new long[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                horizontal[i] += grid[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vertical[i] += grid[j][i];
            }
        }

        long total = 0;
        for (long val : vertical) total += val;

        long prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix += vertical[i];
            if (prefix == total - prefix) {
                return true;
            }
        }

        total = 0;
        for (long val : horizontal) total += val;

        prefix = 0;
        for (int i = 0; i < m; i++) {
            prefix += horizontal[i];
            if (prefix == total - prefix) {
                return true;
            }
        }

        return false;
    }
}
