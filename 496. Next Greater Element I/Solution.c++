class Solution {
public:
    int nextGreater(int n, vector<int>& nums2) {
        int index = 0;
        for (int i = 0; i < nums2.size(); i++) {
            if (n == nums2[i]) {
                index = i;
                break;
            }
        }
        if (index + 1 < nums2.size()) {
            for (int i = index + 1; i < nums2.size(); i++) {
                if (nums2[i] > n) {
                    return nums2[i];
                }
            }
        }
        return -1;
    }
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        for (int i = 0; i < nums1.size(); i++) {
            int greater = nextGreater(nums1[i], nums2);
            result.push_back(greater);
        }
        return result;
    }
};