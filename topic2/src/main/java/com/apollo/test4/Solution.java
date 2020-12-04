package com.apollo.test4;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = {{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int[] lru = solution.LRU(input, 3);
        System.out.println(Arrays.toString(lru));
    }
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        head.next = tail;
        tail.prev = head;
        size = k;
        List<Integer> list = new ArrayList<>();
        for (int[] operator:operators) {
            if (operator[0] == 1) {
                set(operator[1], operator[2]);
            } else {
                list.add(get(operator[1]));
            }
        }
        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    static class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Node head = new Node(-1, -1);
    private final Node tail = new Node(-1, -1);
    private int size;
    Map<Integer, Node> map = new HashMap<>();

    public void set (int key, int value) {
        if (map.containsKey(key)) {
            Node tmp = map.get(key);
            remove(tmp);
            tmp.value = value;
            addHead(tmp);
        } else {
            if (map.size() >= size) {
                Node tmp = tail.prev;
                remove(tmp);
                map.remove(tmp.key);
            }
            Node addNode = new Node(key, value);
            map.put(key, addNode);
            addHead(addNode);
        }
    }

    public int get (int key) {
        if (map.containsKey(key)) {
            Node tmp = map.get(key);
            remove(tmp);
            addHead(tmp);
            return tmp.value;
        } else {
            return -1;
        }
    }

    private void addHead(Node curNode) {
        head.next.prev = curNode;
        curNode.next = head.next;
        curNode.prev = head;
        head.next = curNode;
    }

    private void remove (Node curNode) {
        curNode.prev.next = curNode.next;
        curNode.next.prev = curNode.prev;
    }

}