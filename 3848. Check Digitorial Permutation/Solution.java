class Solution {

    private int[] fact = new int[10];

    public Solution() {
        fact[0] = 1;
        for (int i = 1; i <= 9; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int temp = n;

        int[] freq = new int[10];

        // Count digits of original number
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            sum += fact[digit];
            temp /= 10;
        }

        // Subtract digits of factorial sum
        while (sum > 0) {
            int digit = sum % 10;
            freq[digit]--;
            sum /= 10;
        }

        // Check if all frequencies become zero
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}