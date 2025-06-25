class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int minLen = getMinLength(strs);
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return prefix.toString();  // Mismatch found
                }
            }
            prefix.append(ch);
        }

        return prefix.toString();
    }

    private int getMinLength(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(min, str.length());
        }
        return min;
    }
}
