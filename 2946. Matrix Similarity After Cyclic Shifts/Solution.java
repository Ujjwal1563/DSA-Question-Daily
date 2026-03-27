class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] original = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            original[i] = mat[i].clone();
        }

        k %= cols;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                reverse(mat[i], 0, k - 1);
                reverse(mat[i], k, cols - 1);
                reverse(mat[i], 0, cols - 1);
            } else {
                reverse(mat[i], 0, cols - 1);
                reverse(mat[i], 0, k - 1);
                reverse(mat[i], k, cols - 1);
            }
        }

        return Arrays.deepEquals(original, mat);
    }
    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
