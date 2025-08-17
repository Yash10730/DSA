class Solution {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            long power = power(mid, n); // compute mid^n safely with long

            if (power == m) {
                return mid; // exact nth root found
            } else if (power < m) {
                low = mid + 1; // need a bigger root
            } else {
                high = mid - 1; // need a smaller root
            }
        }
        return -1; // no integer root exists
    }

    // helper function to compute base^exp
    private long power(long base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Long.MAX_VALUE / 2) break; // avoid overflow
        }
        return result;
    }
}
