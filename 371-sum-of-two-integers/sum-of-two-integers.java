class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int sum = a ^ b; // sum without carry
            int carry = (a & b) << 1; // carry shifted left
            a = sum;
            b = carry;
        }
        return a;
    }
}