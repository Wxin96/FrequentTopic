package com.apollo.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(solve(nums, m, k));
    }

    public static int solve(int[] nums, int m, int k) {
        if (nums == null || nums.length <= 0) return 0;
        // 1.初始化数据
        int curLen = 0;
        int res = 0;
        // 2.遍历
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                curLen++;
            } else {
                if (curLen >= m) {
                    res += curLen + 1 - m;
                }
                curLen = 0;
            }
        }
        if (curLen >= m) {
            res += curLen + 1 - m;
        }

        return res;
    }
}
