class Solution {
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }
    public boolean primeBit(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int setBits = countSetBits(i);
            if (primeBit(setBits)) {
                count++;
            }
        }
        return count;
    }
}