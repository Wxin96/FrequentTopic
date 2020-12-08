package com.apollo.test5;

import java.util.HashMap;
import java.util.Map;

public class Main02 {
    public static void main(String[] args) {
        Main02 solution = new Main02();
        System.out.println(solution.seqFilter(new int[]{0, 1, 0, 3, 0, 2, 1, 5}));
        System.out.println(solution.seqFilter(new int[]{0, 0 , 0, 1, 1}));
    }

    public String seqFilter (int[] input){
        if (input == null || input.length <= 0) return "";
        Map<Integer, Boolean> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for (int num : input) {
            if (!map.containsKey(num)) {
                str.append(num).append(" ");
                map.put(num, true);
            } else {
                if (map.get(num)) map.put(num, false);
                else str.append(num).append(" ");

            }
        }
        return str.toString().trim();
    }
}
