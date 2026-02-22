class Solution {
public:
    int scoreDifference(vector<int>& nums) {
        int first = 0;
        int second = 0;
        bool turn = true;
        for (int i =0 ;i<nums.size();i++){
            if(nums[i] % 2 != 0){
                turn = !turn;
            }
            if((i+1) % 6 == 0){
                turn = !turn;
            }
            if(!turn){
                second+=nums[i];
            }
            if(turn){
                first+=nums[i];
            }
        }
        return first-second;
    }
};