class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] X = new int[n];
        int[] Y = new int[n];
        
        int res = 0;
        
        for (int i = 0; i < m; i++) {
            int rx = 0, ry = 0;
            
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'X') rx++;
                else if (grid[i][j] == 'Y') ry++;
                
                X[j] += rx;
                Y[j] += ry;
                
                if (X[j] > 0 && X[j] == Y[j]) {
                    res++;
                }
            }
        }
        
        return res;
    }
}
