class Solution {
public:
    int numberOfSubmatrices(vector<vector<char>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<int> X(n,0);
        vector<int> Y(n,0);
        int res = 0;
        for(int i = 0; i < m; i++){
            int rx = 0, ry = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 'X')rx++;
                else if(grid[i][j] == 'Y')ry++;
                X[j] += rx;
                Y[j] += ry;
                if(X[j] > 0 && X[j] == Y[j]){
                    res++;
                }
            }
        }
        return res;
    }
};