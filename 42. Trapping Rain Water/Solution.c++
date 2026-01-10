class Solution {
public:
    int trap(vector<int>& height) {
        int water =0;
        int lmax = height[0];
        int rmax = height[height.size()-1];
        int i =1 ;
        int j = height.size()-2;
        while(i<=j){
            lmax=max(lmax, height[i]);
            rmax=max(rmax, height[j]);
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
};