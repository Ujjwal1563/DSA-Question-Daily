class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int minx=Integer.MIN_VALUE;
        int miny=Integer.MIN_VALUE;
        int product=0;
        while(i<j){
            minx=Math.max(minx,height[i]);
            miny=Math.max(miny,height[j]);
            product=Math.max(product,Math.min(minx,miny)*(j-i));    
            if(minx<miny){
                i++;
            }
            else{
                j--;
            }
        }
    return product;
    }
}