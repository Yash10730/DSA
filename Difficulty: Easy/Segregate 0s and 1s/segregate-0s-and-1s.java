// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length-1;
        int countZero=0;
        for(int i=0;i<=n;i++){
            if(arr[i]==0){
                countZero++;
            }
            
        }
      //  System.out.println(countZero);
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for(int i=countZero;i<=n;i++){
            arr[i]=1;
        }
    }
}
