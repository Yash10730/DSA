class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int ind = 0;
        for(int i = 1 ; i<n ; i++){
            if(nums[ind]!=nums[i]){
                ind++;
                nums[ind] = nums[i];
            }
        }
        return ind+1;
    }
}