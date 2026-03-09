class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        int MOD = (int)1e9 + 7;

        int[][] dp0 = new int[zero + 1][one + 1];
        int[][] dp1 = new int[zero + 1][one + 1];

        for (int i = 1; i <= Math.min(zero, limit); i++) {
            dp0[i][0] = 1;
        }

        for (int j = 1; j <= Math.min(one, limit); j++) {
            dp1[0][j] = 1;
        }

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {

                long val0 = (long) dp0[i - 1][j] + dp1[i - 1][j];
                if (i - limit - 1 >= 0) {
                    val0 -= dp1[i - limit - 1][j];
                }
                dp0[i][j] = (int)((val0 % MOD + MOD) % MOD);

                long val1 = (long) dp0[i][j - 1] + dp1[i][j - 1];
                if (j - limit - 1 >= 0) {
                    val1 -= dp0[i][j - limit - 1];
                }
                dp1[i][j] = (int)((val1 % MOD + MOD) % MOD);
            }
        }

        return (int)(((long)dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}
