class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ordered = new TreeSet<>();
        for (int n : nums) ordered.add(n);

        int longest = 0, curr = 0;
        Integer prev = null;
        for (int n : ordered) {
            if (prev == null || n == prev + 1) {
                curr++;
            } else {
                curr = 1;
            }
            prev = n;
            longest = Math.max(longest, curr);
        }

        return longest;
    }
}