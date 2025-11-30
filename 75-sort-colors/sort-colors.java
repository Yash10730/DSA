class Solution {
    public void sortColors(int[] nums) {
        int countRed = 0;   // 0s
        int countWhite = 0; // 1s
        int countBlue = 0;  // 2s

        // count frequencies
        for (int x : nums) {
            if (x == 0) countRed++;
            else if (x == 1) countWhite++;
            else countBlue++;
        }

        int k = 0;

        // fill 0s
        while (countRed-- > 0) {
            nums[k++] = 0;
        }

        // fill 1s
        while (countWhite-- > 0) {
            nums[k++] = 1;
        }

        // fill 2s
        while (countBlue-- > 0) {
            nums[k++] = 2;
        }
    }
}
