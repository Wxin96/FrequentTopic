package com.apollo.kmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMP02 {

    public static void main(String[] args) {
        KMP02 kmp = new KMP02();

        int[] next = kmp.build("ABABA");
        System.out.println(Arrays.toString(next));

        System.out.println(kmp.match("ABA", "ABABAA"));
    }


    private int[] build(String pattern) {
        int m = pattern.length();
        int[] next = new int[m + 1];

        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j += 1;
            }
            next[i + 1] = j;
        }

        return next;
    }

    public List<Integer> match(String pattern, String sample) {
        int n = sample.length(), m = pattern.length();
        int[] next = build(pattern);
        List<Integer> res = new ArrayList<>();

        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && sample.charAt(i) != pattern.charAt(j)) {
                j = next[j];
            }
            if (sample.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                res.add(i - m + 1);
                j = next[j];
            }
        }

        return res;
    }

}
