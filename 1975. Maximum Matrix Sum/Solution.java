class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min_val = Integer.MAX_VALUE;
        long sum=0;
        int negative_count =0;
        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    negative_count++;
                }
                min_val=Math.min(min_val,Math.abs(matrix[i][j]));
                sum+=Math.abs(matrix[i][j]);
            }
        }
        if(negative_count%2!=0){
            sum-=2L*min_val;
        }
        return sum;
    }
}