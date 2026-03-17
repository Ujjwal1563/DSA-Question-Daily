class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int ans = 0;
        
        int[] height = new int[n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    height[j] = 0;
                else
                    height[j] += 1;
            }
            
            int[] height1 = height.clone();
            Arrays.sort(height1);
            
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, height1[j] * (n - j));
            }
        }
        
        return ans;
    }
}
