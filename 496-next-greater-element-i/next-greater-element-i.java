class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();  
            st.push(nums2[i]);      }
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i=0;i<n;i++){
          map.put(nums2[i],res[i]);
    }
    for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
    }
    return nums1;
  
    }
}