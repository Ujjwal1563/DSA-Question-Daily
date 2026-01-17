class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest =0;
        Arrays.sort(nums);
        int cnt =0 ;
        int lastSmallest = Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
            if (lastSmallest == nums[i]-1){
                lastSmallest = nums[i];
                cnt++;
            }
            else if(lastSmallest!=nums[i]){
                lastSmallest=nums[i];
                longest=Math.max(longest,cnt);
                cnt=1;
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}