class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return 0; // edge case
        
        // Step 1: Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // remove leftmost, add rightmost
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
