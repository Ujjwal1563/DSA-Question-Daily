class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for (int right =0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }
}

//[0,1,0,3,12]
//[1,3,12,0,0]