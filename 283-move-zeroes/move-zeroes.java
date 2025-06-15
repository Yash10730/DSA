class Solution {
    public void moveZeroes(int[] nums) {
        int temp[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp[j]=0;
                j++;
            }
            else{
                ans[k]=nums[i];
                k++;
            }
        }
        int[] mergedArray = new int[ans.length + temp.length];
        System.arraycopy(ans, 0, mergedArray, 0, ans.length);
System.arraycopy(temp, 0, mergedArray, temp.length, temp.length);
    for(int i=0;i<nums.length;i++){
        nums[i]=mergedArray[i];
    }
    }
}