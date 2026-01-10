class Solution {
    public int trap(int[] height) {
        int water =0;
        int lmax = height[0];
        int rmax = height[height.length-1];
        int i =1 ;
        int j = height.length-2;
        while(i<=j){
            lmax=Math.max(lmax, height[i]);
            rmax=Math.max(rmax, height[j]);
            if(lmax<rmax){
                water+=lmax-height[i];
                i++;
            }
            else {
                water+=rmax-height[j];
                j--;
            }
        }
        return water;
    }
}