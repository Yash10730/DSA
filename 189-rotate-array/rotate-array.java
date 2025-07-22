class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // fix for k > n
        int pivot = n - k;
        int[] arr = new int[n];
        int j = 0;

        for (int i = pivot; i < n; i++) {
            arr[j++] = nums[i];
        }

        for (int i = 0; i < pivot; i++) {
            arr[j++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
