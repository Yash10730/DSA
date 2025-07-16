class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != strArr.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if ((map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(strArr[i]))
                    || (!map.containsKey(pattern.charAt(i)) && map.containsValue(strArr[i]))) {
                return false;
            } else
                map.put(pattern.charAt(i), strArr[i]);
        }
        return true;
    }
}