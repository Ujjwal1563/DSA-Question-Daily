class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        for (int t : workerTimes) {
            pq.offer(new long[]{t, t, 1});
        }

        long ans = 0;
        long curr = mountainHeight;

        while (!pq.isEmpty()) {
            long[] it = pq.poll();

            long maxTime = it[0];
            long baseTime = it[1];
            long reduced = it[2];

            ans = Math.max(ans, maxTime);
            curr--;

            if (curr == 0) break;

            long nextHeight = reduced + 1;
            long total = (baseTime * nextHeight * (nextHeight + 1)) / 2;

            pq.offer(new long[]{total, baseTime, nextHeight});
        }

        return ans;
    }
}