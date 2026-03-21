class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                List<Integer> temp = new ArrayList<>();

                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        temp.add(grid[r][c]);
                    }
                }

                Collections.sort(temp);

                int diff = Integer.MAX_VALUE;

                for (int x = 1; x < temp.size(); x++) {
                    if (!temp.get(x).equals(temp.get(x - 1))) {
                        diff = Math.min(diff, Math.abs(temp.get(x) - temp.get(x - 1)));
                    }
                }

                ans[i][j] = (diff == Integer.MAX_VALUE) ? 0 : diff;
            }
        }

        return ans;
    }
}
