class Solution {
public:
    int getDist(int a, int b){
        if(a == -1) return 0;
        int r1 = a / 6, c1 = a % 6;
        int r2 = b / 6, c2 = b % 6;
        return abs(r1 - r2) + abs(c1 - c2);
    }

    int minimumDistance(string word) {
        int n = word.size();
        
        vector<int> dp(26, 0);
        int total = 0, save = 0;

        for(int i = 0; i < n - 1; i++){
            int a = word[i] - 'A';
            int b = word[i + 1] - 'A';

            int dist = getDist(a, b);
            total += dist;

            vector<int> newDp = dp;

            for(int j = 0; j < 26; j++){
                newDp[a] = max(newDp[a], dp[j] + dist - getDist(j, b));
            }

            dp = newDp;
        }

        for(int x : dp) save = max(save, x);

        return total - save;
    }
};
