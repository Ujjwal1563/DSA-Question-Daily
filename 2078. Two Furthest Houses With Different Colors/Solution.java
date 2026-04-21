class Solution {
    public int maxDistance(int[] A) {
        int j = A.length;
        int left = 0, right = 0;

        for (int i = 0; i < j; i++) {
            if (A[i] != A[j - 1]) {
                left = j - 1 - i;
                break;
            }
        }

        for (int i = 0; i < j; i++) {
            if (A[j - 1 - i] != A[0]) {
                right = j - 1 - i;
                break;
            }
        }

        return Math.max(left, right);
    }
}
