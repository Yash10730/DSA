class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);

            if (mp.get(num) > majorityCount) {
                return num;
            }
        }

        // According to the problem, a majority element always exists
        return -1; // This line will never be reached if input is valid
    }
}
