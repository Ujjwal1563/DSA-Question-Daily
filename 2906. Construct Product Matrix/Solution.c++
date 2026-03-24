class Solution {
public:
    vector<vector<int>> constructProductMatrix(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>>ans(m, vector<int>(n));
        vector<vector<int>>xx(m, vector<int>(n));
        vector<vector<int>>yy(m, vector<int>(n));
        
        long long product = 1;
        int mod = 12345;
        for(int i = 0; i< m;i++){
            for (int j =0;j<n;j++){
                xx[i][j] = product;
                product*= grid[i][j];
                product%=mod;
            }
        }
        product=1;
        for(int i = m-1; i>= 0;i--){
            for (int j =n-1;j>=0;j--){
                yy[i][j] = product;
                product*= grid[i][j];
                product%=mod;
            }
        }
        for(int i = 0; i< m;i++){
            for (int j =0;j<n;j++){
                long long mul = xx[i][j]*yy[i][j];
                ans[i][j]=mul%mod;
            }
        }
        return ans;
    }
};