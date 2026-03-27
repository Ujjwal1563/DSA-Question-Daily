class Solution {
public:
    bool areSimilar(vector<vector<int>>& mat, int k) {
        vector<vector<int>> original = mat;
        int cols = mat.size();
        k %= mat[0].size();
        for (int i = 0; i < cols; i++) {

            if (i % 2 == 0) {
                rotate(mat[i].begin(), mat[i].begin() + k, mat[i].end());
            } else {
                rotate(mat[i].rbegin(), mat[i].rbegin() + k, mat[i].rend());
            }
        }
        return original == mat;
    }
};