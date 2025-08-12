class Solution {
    public int MOD = (int) 1e9 + 7;

    public int numberOfWays(int n, int x) {
        int[][] memo = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(memo[i], -1);

        int res = f(n, x, n, memo);
        return res;
    }

    public int f(int n, int x, int i, int[][] memo) {
        if (n == 0)
            return 1;

        if (n < 0 || i <= 0)
            return 0;

        if (memo[n][i] != -1)
            return memo[n][i];

        int t = f(n - (int) Math.pow(i, x), x, i - 1, memo);
        int s = f(n, x, i - 1, memo);
        memo[n][i] = (t + s) % MOD;
        return memo[n][i];
    }
}