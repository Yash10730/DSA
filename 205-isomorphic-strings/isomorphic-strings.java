class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Compare last seen positions
            if (sMap[ch1] != tMap[ch2]) {
                return false;
            }

            // Update last seen positions
            sMap[ch1] = i + 1;
            tMap[ch2] = i + 1;
        }

        return true;
    }
}
