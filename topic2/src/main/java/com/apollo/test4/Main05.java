package com.apollo.test4;

import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) {
        System.out.println(solve("21202", 5));
    }

    public static int solve(String str, int n) {
        if (str == null || str.length() <= 0) return 0;
        int len = str.length();

        int[] dp = new int[len];
        int[] record = new int[10];
        Arrays.fill(record, -1);
        // BASE CASE
        record[str.charAt(0) - '0'] = 0;

        for (int i = 1; i < len; i++) {
            int curVal = str.charAt(i) - '0';
            if (record[curVal] != -1) {
                dp[i] = Math.min(dp[record[curVal]], dp[i - 1]) + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
                record[curVal] = i;
            }
        }

        return dp[len - 1];
    }
}
