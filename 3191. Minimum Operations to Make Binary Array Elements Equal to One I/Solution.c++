class Solution {
public:
    int minOperations(vector<int>& nums) {
        int count =0;
        for (int i = 0; i < nums.size()-2; i++){
            if (nums[i]==0){
                nums[i] = 1;
                nums[i+1] = !nums[i+1];
                nums[i+2] = !nums[i+2];
                count +=1;
            }
        }
        for (int num : nums){
            if(num == 0) return -1;
        }
        return count;
    }
};