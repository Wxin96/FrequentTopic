package com.apollo.test5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main03 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        long idx = 0;
        nums[(int) idx] = 1;
        System.out.println(Integer.MAX_VALUE - (128) - 1);
        System.out.println(255 == new Integer(255));
        Queue<Integer> queue = new LinkedList<Integer>() {
            {
                System.out.println("你好");
            }
        };
        Deque<Integer> deque = new ArrayDeque<>();
        deque.peekFirst();
    }
}
