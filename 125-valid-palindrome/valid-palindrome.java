class Solution {
    public boolean isPalindrome(String s) {
         String ans = s.replaceAll("\\s+", "").toLowerCase();
             String result = ans.replaceAll("[^a-zA-Z0-9]", "");
         if(s==" ")return true;
         char ch[]=result.toCharArray();
         int n=ch.length;
      
         int i=0;
         int j=n-1;
         System.out.print(ans);
     while(i<=j){
        if(ch[i]!=ch[j]){
            return false;
        }else{
            i++;
            j--;
            
        }
     }
       

    
    return true;
    }
}