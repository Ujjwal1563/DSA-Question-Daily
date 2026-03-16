class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        TreeSet<Integer> st = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                st.add(grid[i][j]);

                for (int k = 1; ; k++) {
                    int r = i + 2 * k;
                    int left = j - k;
                    int right = j + k;

                    if (r >= m || left < 0 || right >= n) break;

                    int sum = 0;
                    int x = i, y = j;

                    for (int t = 0; t < k; t++)
                        sum += grid[x + t][y + t];

                    for (int t = 0; t < k; t++)
                        sum += grid[x + k + t][y + k - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[x + 2 * k - t][y - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[x + k - t][y - k + t];

                    st.add(sum);
                }
            }
        }

        int size = Math.min(3, st.size());
        int[] ans = new int[size];

        int index = 0;
        Iterator<Integer> it = st.descendingIterator();
        while (it.hasNext() && index < 3) {
            ans[index++] = it.next();
        }

        return ans;
    }
}
