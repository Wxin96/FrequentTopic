package com.apollo.lru;

import java.util.*;

public class LRU03 {

    public static void main(String[] args) {
        LRU03 solution = new LRU03();
        int[][] operators = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int[] lru = solution.LRU(operators, 3);
        System.out.println(Arrays.toString(lru));
    }

    public int[] LRU (int[][] operators, int k) {
        // write code here
        if (operators == null || operators.length <= 0) return new int[]{};
        head.next = tail;
        tail.prev = head;
        size = k;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < operators.length; i++){
            if (operators[i][0] == 1) {
                set(operators[i][1], operators[i][2]);
            } else {
                list.add(get(operators[i][1]));
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map = new HashMap<>();
    private int size;
    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);

    public void set (int key, int value) {
        if (map.containsKey(key)) {
            Node curNode = map.get(key);
            remove(curNode);
            addHead(curNode);
            curNode.value = value;
        } else {
            if (map.size() >= size) {
                Node toDelete = tail.prev;
                map.remove(toDelete.key);
                remove(toDelete);
            }
            Node toInsert = new Node(key, value);
            map.put(key, toInsert);
            addHead(toInsert);
        }
    }

    public int get (int key) {
        if (map.containsKey(key)) {
            Node curNode = map.get(key);
            remove(curNode);
            addHead(curNode);
            return curNode.value;
        } else {
            return -1;
        }
    }

    private void addHead(Node curNode) {
        curNode.next = head.next;
        head.next = curNode;
        curNode.next.prev = curNode;
        curNode.prev = head;
    }

    private void remove(Node toDelete) {
        toDelete.prev.next = toDelete.next;
        toDelete.next.prev = toDelete.prev;
    }
}
