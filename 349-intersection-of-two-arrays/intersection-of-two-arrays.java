class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                result.put(nums2[i],i);
            }
        }


        int arr[] = new int[result.size()];
        int k=0;
        for(var entry:result.entrySet()){
            arr[k++] = entry.getKey();
        }

        return arr;
    }
}