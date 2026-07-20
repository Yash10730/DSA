class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        if(nums.length==1 && nums[0]==target){
            res[0]=0;
            res[1]=0;
        }
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            res[0]=i;
            break;
        }
       } 
       for(int j=nums.length-1;j>=0;j--){
        if(nums[j]==target){
            res[1]=j;
            break;
        }
       }
       return res;
    }
}