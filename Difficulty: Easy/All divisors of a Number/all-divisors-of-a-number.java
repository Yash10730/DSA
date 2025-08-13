class Solution {
    public static void print_divisors(int n) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i*i<=n;i++){
           if(n%i==0){
               if(n/i==i){
                   System.out.print(i+" ");
               }
               else{
                   System.out.print(i+" ");
                   list.add(n/i);
               }
           }
       }
        for(int j=list.size()-1;j>=0;j--){
             System.out.print(list.get(j)+" ");
           }
    }
}