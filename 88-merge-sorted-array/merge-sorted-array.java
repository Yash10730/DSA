class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           // Pointer for last valid element in nums1
        int j = n - 1;           // Pointer for last element in nums2
        int k = m + n - 1;       // Pointer for last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];  // Move larger element to the end
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to handle remaining nums1[i], as they are already in place
    }
}
