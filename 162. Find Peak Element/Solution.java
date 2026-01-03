class Solution {
    public int findPeakElement(int[] nums) {
        int peakidx = nums.length-1;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                peakidx=i;
                break;
            }
        }
        return peakidx;
    }
}