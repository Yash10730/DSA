class Solution {
    //OPTIMAL APPROACH:Modified LOWER_BOUND
    //CONDITION(arr[i] <= x if i not exist we return here -1 instead of n as we are doing in lower bound )
 
    public int findFloor(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int floor = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                floor = mid;
                low  = mid+1;
            }else{
                high = mid-1;
            }
        }
        return floor;
    }
}