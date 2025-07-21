class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxi=0;
        int secMaxi=-1;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<maxi){
                secMaxi=Math.max(arr[i],secMaxi);
            }
        }
           //  if(maxi==secMaxi)return -1;
            
        
        return secMaxi;
    }
}