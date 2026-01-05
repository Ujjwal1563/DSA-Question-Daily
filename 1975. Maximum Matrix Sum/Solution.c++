class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        int min_val = INT_MAX;
        long sum=0;
        int negative_count =0;
        for (int i =0;i<matrix.size();i++){
            for (int j=0;j<matrix[0].size();j++){
                if(matrix[i][j]<0){
                    negative_count++;
                }
                min_val=min(min_val,abs(matrix[i][j]));
                sum+=abs(matrix[i][j]);
            }
        }
        if(negative_count%2!=0){
            sum-=2L*min_val;
        }
        return sum;
    }
};