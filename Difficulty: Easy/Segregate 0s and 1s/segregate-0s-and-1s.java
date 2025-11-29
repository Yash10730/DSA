// User function Template for Java
class Solution {
    public void segregate0and1(int[] arr) {
        int countZero = 0;

        // Count the number of 0s
        for (int num : arr) {
            if (num == 0) countZero++;
        }

        // Fill first part with 0s
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill the rest with 1s
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
