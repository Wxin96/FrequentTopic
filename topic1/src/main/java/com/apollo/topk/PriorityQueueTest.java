package com.apollo.topk;

import java.util.PriorityQueue;

/**
 * 小顶堆
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(1);
        priorityQueue.offer(6);
        priorityQueue.offer(3);
        priorityQueue.offer(4);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
