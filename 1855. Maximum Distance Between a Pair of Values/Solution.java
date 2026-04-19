class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int pair = 0;
        for(int i =0, j=0;i < nums1.length && j < nums2.length;){
            if(i<=j && nums1[i] <= nums2[j]) {
                pair = Math.max(pair, j-i); 
                j++;
            }
            else if (i <= j) i++;
            else j++;    
        }
        return pair;
    }
}