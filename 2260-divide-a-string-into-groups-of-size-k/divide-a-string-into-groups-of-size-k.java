class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int remainder = len % k;

        // If s is not divisible by k, pad with fill
        if (remainder != 0) {
            int fillCount = k - remainder;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < fillCount; i++) {
                sb.append(fill);
            }
            s = sb.toString();
            len = s.length(); // update length after padding
        }

        // Now slide the window
        int parts = len / k;
        String[] result = new String[parts];
        for (int i = 0; i < len; i += k) {
            result[i / k] = s.substring(i, i + k);
        }

        return result;
    }
}
