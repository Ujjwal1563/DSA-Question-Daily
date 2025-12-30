class Solution {
public:
    int maxArea(vector<int>& height) {
       int i =0;
       int j = height.size()-1;
       int minx=INT_MIN;
       int miny=INT_MIN;
       int product=0;
       while(i<j){
            minx=max(minx,height[i]);
            miny=max(miny,height[j]);
            product= max(product,min(minx,miny)*(j-i));
            if(minx<miny){
                i++;
            }
            else{
                j--;
            }
       }
       return product; 
    }
};