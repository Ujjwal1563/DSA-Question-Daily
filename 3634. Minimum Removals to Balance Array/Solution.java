class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int diff = 1;
        int n = nums.length;
        int maxEle = nums[0];
        int minEle = nums[0];
        while(j < n){
            minEle = nums[i];
            maxEle = nums[j];
            while(i < j && maxEle > (long )k * minEle){
                i++;
                minEle = nums[i];
            }
            diff = Math.max(diff, j - i + 1);
            j++;
        } 

        return n - diff;
    }
}