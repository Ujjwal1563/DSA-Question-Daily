import java.util.*;

class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));

        int m = robot.size();
        int n = factory.length;

        long[][] dp = new long[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            dp[i][n] = Long.MAX_VALUE;
        }

        for (int j = n - 1; j >= 0; j--) {
            long prefix = 0;

            Deque<long[]> deque = new ArrayDeque<>();
            deque.offerLast(new long[]{m, 0});

            for (int i = m - 1; i >= 0; i--) {
                prefix += Math.abs(robot.get(i) - factory[j][0]);

                while (!deque.isEmpty() && deque.peekFirst()[0] > i + factory[j][1]) {
                    deque.pollFirst();
                }

                while (!deque.isEmpty() && deque.peekLast()[1] >= dp[i][j + 1] - prefix) {
                    deque.pollLast();
                }

                deque.offerLast(new long[]{i, dp[i][j + 1] - prefix});

                dp[i][j] = deque.peekFirst()[1] + prefix;
            }
        }

        return dp[0][0];
    }
}
