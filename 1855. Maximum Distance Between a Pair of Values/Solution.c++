class Solution {
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int pair = 0;
        for(int i =0, j=0;i < nums1.size() && j < nums2.size();){
            if(i<=j && nums1[i] <= nums2[j]) {
                pair = max(pair, j-i); 
                j++;
            }
            else if (i <= j) i++;
            else j++;    
        }
        return pair;
    }
};