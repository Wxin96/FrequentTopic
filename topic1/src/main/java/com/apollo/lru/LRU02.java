package com.apollo.lru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRU02 {
    private Map<Integer, Node> map = new HashMap<>();
    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);
    private int size = 0;


    public int[] LRU (int[][] operators, int k) {
        // init
        head.next = tail;
        tail.prev = head;
        size = k;

        List<Integer> list = new ArrayList<>();
        for (int[] operator : operators) {
            if (operator[0] == 1) {
                set(operator[1], operator[2]);
            } else {
                list.add(get(operator[1]));
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    private void set (int key, int value) {
        if (get(key) > -1) {
            map.get(key).value = value;
        } else {
            if (map.size() >= size) {
                Node toDel = tail.prev;
                remove(toDel);
                map.remove(toDel.key);
            }
            Node toInsert = new Node(key, value);
            map.put(key, toInsert);
            addFirst(toInsert);
        }
    }

    private int get (int key) {
        if (map.containsKey(key)) {
            Node curNode = map.get(key);
            remove(curNode);
            addFirst(curNode);
            return curNode.value;
        } else {
            return -1;
        }
    }

    private void addFirst (Node node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = node;
    }

    private void remove (Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    static class Node {
        Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
        int key;
        int value;
        Node prev;
        Node next;
    }
}
