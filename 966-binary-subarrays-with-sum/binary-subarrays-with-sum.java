class Solution {
    int sum(int[] nums , int goal){
        int l = 0, r = 0, count = 0, sum = 0;
        while (r != nums.length) {
            if (goal < 0) return 0;

            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return sum(nums, goal) - sum(nums, goal - 1);
    }
}
