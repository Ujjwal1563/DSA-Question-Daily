class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
        int diff =Integer.MAX_VALUE ;
        int closest = 0 ;
        for (int i =0;i<nums.length-2;i++){
            int l =i+1 ;
            int r= nums.length-1;
            while(l<r){
                int threeSum = nums[i]+nums[l]+nums[r];
                if(threeSum>target){
                    int checkDiff=threeSum-target;
                    if(checkDiff<diff){
                        diff=checkDiff;
                        closest=threeSum;
                    }
                    r--;
                }
                else if (threeSum<target){
                    int checkDiff=target-threeSum;
                    if(checkDiff<diff){
                        diff=checkDiff;
                        closest=threeSum;
                    }
                    l++;
                }
                else {
                    diff=threeSum-target;
                    closest=threeSum;
                    return closest;
                }
            }
        }
        return closest;  
    }
}