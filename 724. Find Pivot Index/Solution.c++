class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int leftSum =0 ;
        int rightSum=accumulate(nums.begin(),nums.end(),0);
        for ( int i = 0;i < nums.size();i++){
            rightSum-=nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
};

// class Solution {
// public:
//     int pivotIndex(vector<int>& nums) {
//         int n = nums.size();
//         vector<int> prefix(n + 1);
//         prefix[0] = 0;
//         for (int i = 0; i < n; i++){
//             prefix[i + 1] = nums[i] + prefix[i];
//         }
//         for (int i = 1; i < n + 1; i++){
//             if(prefix[i - 1] == (prefix[n] - prefix[i])){
//                 return i-1;
//             }
//         }
//         return -1;
//     }
// };