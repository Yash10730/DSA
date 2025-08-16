class Solution {
    int upperBound(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >target) {
                return i;   // first index where arr[i] >= target
            }
        }
        return arr.length; // if no element is >= target
    }
    }

