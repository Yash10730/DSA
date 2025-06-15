import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        for (int key : h.keySet()) {
            if (h.get(key) == 1) {
                return key;
            }
        }

        return -1; // In case no single number is found
    }
}
