

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true; // Duplicate found
            } else {
                map.put(num, true);
            }
        }
        
        return false; // No duplicates
    }
}

    