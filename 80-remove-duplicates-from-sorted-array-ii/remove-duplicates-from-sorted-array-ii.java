class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        if (n<=2) return n;

        int k=1;        
        int count=1;    

        for (int r=1;r<n;r++) {
            if(nums[r]==nums[r - 1]) {
                count++;
            } else{
                count=1; 
            }

            if (count <= 2) {
                nums[k] = nums[r];
                k++;
            }
        }

        return k; 
    }
}
