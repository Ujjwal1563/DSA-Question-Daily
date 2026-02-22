class Solution {
    public int scoreDifference(int[] nums) {
        int first = 0;
        int second = 0;
        boolean turn = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                turn = !turn;
            }
            if ((i + 1) % 6 == 0) {
                turn = !turn;
            }
            if (!turn) {
                second += nums[i];
            }
            if (turn) {
                first += nums[i];
            }
        }
        return first - second;
    }
}