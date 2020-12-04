package com.apollo.test5;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        Main solution = new Main();
        ListNode ret = solution.merge(l1, l2);

        while (ret != null) {
            System.out.println(ret.value);
            ret = ret.next;
        }
    }

    public ListNode merge (ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        if (l1.value <= l2.value) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

}


class ListNode {
    int value;
    ListNode next;
    ListNode (int value) {
        this.value = value;
    }
}

