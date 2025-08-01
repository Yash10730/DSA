class Solution {
    public int solve(int[] nums , int x , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        int length = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(map.containsKey((x-nums[i])%k)){
                length = Math.max(  map.get(  (x-nums[i])%k ) + 1 , length);
                map.put(nums[i] , map.get(  (x-nums[i])%k ) + 1);
            }
            else if(map.containsKey(((x-nums[i])%k+k)%k)){
                length = Math.max(map.get( ((x-nums[i])%k+k)%k )+1 , length);
                map.put(nums[i] , map.get( ((x-nums[i])%k+k)%k )+1);
            }
            else{
                map.put(nums[i] , 0);
            }
        }
        return length;
    }
    public int maximumLength(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ;i++){
            nums[i]%= k;
        }
        int ans = 0;
        for(int i = 0 ; i < k ; i++){
            ans = Math.max(ans , solve(nums , i , k));
        }
        return ans+1;
    }
}