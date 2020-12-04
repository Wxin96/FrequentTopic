package com.apollo.test2;

public class Main05 {
    public static void main(String[] args) {
        Main05 solution = new Main05();
        System.out.println(solution.getAmount(6));
    }

    long getAmount(int m) {
        if (m < 0) return -1;

        long[] dp = new long[m + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= m; i++) {
            dp[i] = dp[i-1] + dp[i - 3];
        }

        return dp[m];
    }
}
