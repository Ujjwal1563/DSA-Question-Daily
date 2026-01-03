class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int peakidx = nums.size() - 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                peakidx = i;
                break;
            }
        }
        return peakidx;
    }
};