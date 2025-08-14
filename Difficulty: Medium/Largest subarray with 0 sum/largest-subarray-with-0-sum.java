import java.util.*;

class Solution {
    int maxLength(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>(); // prefixSum -> firstIndex
        int sum = 0;
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                longest = i + 1; // subarray from 0 to i
            }

            if (map.containsKey(sum)) {
                // Found same prefix sum again → subarray sum = 0
                longest = Math.max(longest, i - map.get(sum));
            } else {
                map.put(sum, i); // store first occurrence
            }
        }

        return longest;
    }

  
}
