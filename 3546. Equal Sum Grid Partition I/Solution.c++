class Solution {
public:
    bool canPartitionGrid(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<long long> vertical(n,0);
        vector<long long> horizontal(m,0);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                horizontal[i] += grid[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                vertical[i] += grid[j][i];
            }
        }
        long long total = accumulate(vertical.begin(),vertical.end(),0LL);
        long long prefix= 0;
        for(int i =0;i<n;i++){
            prefix += vertical[i];
            if(prefix == total - prefix){
                return true;
            }
        }
        total = accumulate(horizontal.begin(),horizontal.end(),0LL);
        prefix= 0;
        for(int i =0;i<m;i++){
            prefix += horizontal[i];
            if(prefix == total - prefix){
                return true;
            }
        }
        return false;
    }
};