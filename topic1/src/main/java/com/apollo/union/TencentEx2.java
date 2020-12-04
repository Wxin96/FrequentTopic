package com.apollo.union;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TencentEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            List<Integer> curList = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                curList.add(scanner.nextInt());
            }
            list.add(curList);
        }


        System.out.println(solve2(list, n));
    }

    public static int solve2(List<List<Integer>> list, int n) {
        // 0.数据处理
        if (list == null || list.size() == 0) return 1;
        // 1.初始化数据
        int[] pre = new int[n + 1];
        for (int i = 0; i < pre.length; i++) {
            pre[i] = i;
        }
        // 2.迭代
        for (int i = 0; i < list.size(); i++) {
            List<Integer> group = list.get(i);
            int boss = find(pre, group.get(0));
            for (int j = 1; j < group.size(); j++) {
                union(pre, boss, group.get(j));
            }
        }
        // 3.统计
        int refBoss = find(pre, 0);
        int count = 0;
        for (int i = 0; i < pre.length; i++) {
            if (find(pre, i) == refBoss) {
                count++;
            }
        }
        return count;
    }

    // 组合
    private static void union(int[] pre, int i, int j) {
        int boss1 = find(pre, i);
        int boos2 = find(pre, j);
        // union
        pre[boos2] = boss1;
    }

    // 查询+路径压缩
    private static int find(int[] pre, int k) {
        return k == pre[k] ? pre[k] : (pre[k] = find(pre, pre[k]));
    }

}
