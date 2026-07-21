class Solution {

    public void swap(int[] nums, int left, int right) {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right] = temp;
    }
    public void sortColors(int[] nums) {
        for (int i=0;i<nums.length-1;i++) {
            for (int j=0;j<nums.length-i-1;j++) {
                if (nums[j]>nums[j + 1]) {
                    swap(nums,j,j+1 );
                }
            }
        }
    }
}