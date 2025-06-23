class Solution {
    public int search(int[] nums, int target){
        int n = nums.length, temp = n;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1])
            temp = i+1;
        }
        int x = Arrays.binarySearch(Arrays.copyOfRange(nums, 0, temp), target);
        int y = Arrays.binarySearch(Arrays.copyOfRange(nums, temp, n), target);
        if(y >= 0) return y + temp;
        if(x >= 0) return x;
        return -1;
    }
}
