package com.apollo.test4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        System.out.println(sortString("leetcode"));
    }

    public static String sortString(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        StringBuilder str = new StringBuilder();
        while (s.length() > str.length()) {
            for (Map.Entry<Character, Integer> next : map.entrySet()) {
                if (next.getValue() > 0) {
                    str.append(next.getKey());
                    next.setValue(next.getValue() - 1);
                } /*else {
                    map.remove(next.getKey());
                }*/
            }
            Iterator<Character> iterator = map.descendingKeySet().iterator();
            while (iterator.hasNext()) {
                char next = iterator.next();
                if (map.get(next) > 0) {
                    str.append(next);
                    map.put(next, map.get(next) - 1);
                } /*else {
                    map.remove(next);
                }*/
            }
        }

        return str.toString();
    }
}
