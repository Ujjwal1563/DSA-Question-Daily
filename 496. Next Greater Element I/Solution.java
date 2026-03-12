class Solution {

    public int nextGreater(int n, int[] nums2) {
        int index = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (n == nums2[i]) {
                index = i;
                break;
            }
        }

        if (index + 1 < nums2.length) {
            for (int i = index + 1; i < nums2.length; i++) {
                if (nums2[i] > n) {
                    return nums2[i];
                }
            }
        }

        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater(nums1[i], nums2);
        }

        return result;
    }
}
