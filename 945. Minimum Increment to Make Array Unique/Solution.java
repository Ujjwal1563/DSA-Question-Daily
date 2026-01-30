class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int need = 0;
        for(int i =0 ;i< nums.length ;i++){
            ans += Math.max(need - nums[i] , 0);
            need = Math.max(nums[i] , need) + 1;
        }
        return ans;
        
    }
}
//1 1 2 2 3 7 -> 1 2 3 4 5 7
//ans =  1  need = 2 
//ans =  1  need = 2
//ans =  0  need = 3
//ans =  1  need = 3
//ans =  0  need = 4
//ans =  3  need = 7