class Solution {
    public int minimumCost(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = nums[0];
        for (int i = 1; i < nums.length;i++){
            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i] < min2){
                min2 = nums[i];
            }
        }
        return min1+min2+min3;
    }
}
