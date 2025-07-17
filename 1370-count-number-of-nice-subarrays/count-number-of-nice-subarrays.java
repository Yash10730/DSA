class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // prefix count base case

        int count = 0;
        int oddCount = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }

            // Check if there was a prefix with oddCount - k odds
            if (countMap.containsKey(oddCount - k)) {
                count += countMap.get(oddCount - k);
            }

            // Update map with current oddCount
            countMap.put(oddCount, countMap.getOrDefault(oddCount, 0) + 1);
        }

        return count;
    }
}
