class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int curr = nums1[i];
            int greaterel = -1;

            int j; 

            // Find index of curr in nums2 array
            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == curr) {
                    break;
                }
            }

            // Find next greater element
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > curr) {
                    greaterel = nums2[k];
                    break;
                }
            }

            ans[i] = greaterel;
        }

        return ans;
    }
}
