package com.apollo.test4;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        String[] cardCover = {"1101", "1010", "11111", "1110"};
        String[] cardChar = {"ABCD", "EFGH", "IJKL", "MNPQ"};
        System.out.println(solve(cardCover, cardChar));
    }

    public static String solve (String[] cardCover, String[] cardChar) {
        if (cardCover == null || cardCover.length <= 0 || cardChar == null || cardChar.length <= 0) {
            return "";
        }

        int n = cardChar.length;
        List<int[]> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cardCover[i].charAt(j) == '0') {
                    list.add(new int[]{i, j});
                }
            }
        }
        // for (int[] nums : list) {
        //     System.out.println(Arrays.toString(nums));
        // }

        for (int i = 0; i < 4; i++) {
            StringBuilder curStr = produceString(list, cardChar);
            res.append(curStr);
            list = rotate(list, n-1);
        }

        return res.toString();
    }

    private static List<int[]> rotate (List<int[]> list, int n) {
        List<int[]> newList = new ArrayList<>();
        for (int[] location : list) {
            newList.add(new int[]{location[1], n - location[0]});
        }

        newList.sort((x, y) -> (x[0] != y[0]) ? x[0] - y[0] : x[1] - y[1]);

        // for (int[] nums : newList) {
        //     System.out.println(Arrays.toString(nums));
        // }

        return newList;
    }

    private static StringBuilder produceString (List<int[]> list, String[] cardChar) {
        StringBuilder str = new StringBuilder();

        for (int[] location : list) {
            str.append(cardChar[location[0]].charAt(location[1]));
        }

        return str;
    }
}
