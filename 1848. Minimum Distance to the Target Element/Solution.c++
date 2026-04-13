class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int x = INT_MAX;
        for(int i = 0 ; i < nums.size();i++){
            if ( nums[i] == target){
                int y = abs( i - start);
                x = min(x, y);
            }
        }
        return x;
    }
};