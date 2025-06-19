class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        // Binary search to find where kth missing number lies
        while (s <= e) {
            int m = s + (e - s) / 2;
            int missing = arr[m] - (m + 1); // missing numbers before index m

            if (missing < k) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        // s is the count of numbers in arr before the kth missing number
        return s + k;
    }
}