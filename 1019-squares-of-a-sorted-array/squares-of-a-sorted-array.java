class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;          // start pointer
        int right = n - 1;     // end pointer
        int pos = n - 1;       // fill from the end in ans[]

        while (left <= right) {
            int lsq = nums[left] * nums[left];
            int rsq = nums[right] * nums[right];

            if (lsq > rsq) {
                ans[pos] = lsq;
                left++;
            } else {
                ans[pos] = rsq;
                right--;
            }
            pos--;
        }

        return ans;
    }
}
