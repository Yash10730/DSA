class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        for(int i=0;i<ch.length;i++){
            m1.put(ch[i], m1.getOrDefault(ch[i], 0) + 1);
            m2.put(ch1[i], m2.getOrDefault(ch1[i], 0) + 1);
        }
         return m1.equals(m2);
}
}