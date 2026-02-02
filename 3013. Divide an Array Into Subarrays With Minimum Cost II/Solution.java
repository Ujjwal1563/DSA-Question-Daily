import java.util.*;

class Solution {

    static class Pair {
        long val;
        long idx;

        Pair(long val, long idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;

        // Comparator: sort by value, then index
        Comparator<Pair> cmp = (a, b) -> {
            if (a.val != b.val) return Long.compare(a.val, b.val);
            return Long.compare(a.idx, b.idx);
        };

        TreeSet<Pair> kMinimum = new TreeSet<>(cmp);
        TreeSet<Pair> remaining = new TreeSet<>(cmp);

        long sum = 0;
        int i = 1;

        // Initial window
        while (i - dist < 1) {
            Pair p = new Pair(nums[i], i);
            kMinimum.add(p);
            sum += p.val;

            if (kMinimum.size() > k - 1) {
                Pair temp = kMinimum.last();
                sum -= temp.val;
                remaining.add(temp);
                kMinimum.remove(temp);
            }
            i++;
        }

        long result = Long.MAX_VALUE;

        // Sliding window
        while (i < n) {
            Pair p = new Pair(nums[i], i);
            kMinimum.add(p);
            sum += p.val;

            if (kMinimum.size() > k - 1) {
                Pair temp = kMinimum.last();
                sum -= temp.val;
                remaining.add(temp);
                kMinimum.remove(temp);
            }

            result = Math.min(result, sum);

            Pair remove = new Pair(nums[i - dist], i - dist);
            if (kMinimum.contains(remove)) {
                kMinimum.remove(remove);
                sum -= remove.val;

                if (!remaining.isEmpty()) {
                    Pair temp = remaining.first();
                    kMinimum.add(temp);
                    sum += temp.val;
                    remaining.remove(temp);
                }
            } else {
                remaining.remove(remove);
            }
            i++;
        }

        return nums[0] + result;
    }
}

