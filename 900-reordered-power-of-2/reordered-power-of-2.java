import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Convert number to string and sort
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String sortedN = new String(chars);

        // Check all powers of 2 up to the limit of int
        for (int i = 1; i <= 1_000_000_000; i <<= 1) {
            char[] powerChars = String.valueOf(i).toCharArray();
            Arrays.sort(powerChars);
            String sortedPower = new String(powerChars);
            if (sortedN.equals(sortedPower)) {
                return true;
            }
        }
        return false;
    }
}
