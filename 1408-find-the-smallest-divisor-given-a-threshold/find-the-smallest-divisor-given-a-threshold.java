class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = getMax(nums);  // Range for binary search
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDivide(nums, mid, threshold)) {
                result = mid;         // Try smaller divisor
                right = mid - 1;
            } else {
                left = mid + 1;       // Try bigger divisor
            }
        }

        return result;
    }

    // Helper to find max value in nums
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Check if using divisor `div` keeps the sum within threshold
    private boolean canDivide(int[] nums, int div, int threshold) {
        int total = 0;
        for (int num : nums) {
            total += (num + div - 1) / div;  // ceil(num / div)
        }
        return total <= threshold;
    }
}
