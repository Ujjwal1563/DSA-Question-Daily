class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int x = Integer.MAX_VALUE;
        for (int i =0; i< nums.length;i++){
            if (nums[i] == target){
                int y = Math.abs(i-start);
                x = Math.min(x, y);
            }
        }
        return x;
    }
}