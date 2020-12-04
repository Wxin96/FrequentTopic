package com.apollo.kmp;

public class KMP {

    private int[][] dp;
    private String pat;

    public KMP(String pat) {
        this.pat = pat;
        int M = pat.length();
        // dp[状态][字符] = 下一个状态
        dp = new int[M][256];
        // base case
        dp[0][pat.charAt(0)] = 1;
        // 影子状态 X, 初始为 0
        int X = 0;
        // 状态转移
        for (int j = 1; j < M; j++) {
            // System.arraycopy(dp[X], 0, dp[j], 0, 256);
            for (int c = 0; c < 256; c++) {
                dp[j][c] = dp[X][c];
            }
            dp[j][pat.charAt(j)] = j + 1;
            // 更新影子状态
            X = dp[X][pat.charAt(j)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        // pat的初始状态为 0
        int j = 0;
        for (int i = 0; i < N; i++) {
            // 计算pat的下一个状态
            j = dp[j][txt.charAt(i)];
            // 到达终止态, 返回结果
            if (j == M) return i - M + 1;
        }
        // 没到达终止态，匹配失败
        return -1;
    }

}
