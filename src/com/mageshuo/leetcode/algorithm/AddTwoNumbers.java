package com.mageshuo.leetcode.algorithm;

public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int left = 0;
        ListNode dummy = new ListNode(0), tail = dummy;
        while(!(l1 == null && l2 == null && left == 0 )) {
            int add1 = l1 != null ? l1.val : 0;
            int add2 = l2 != null ? l2.val : 0;
            int sum = add1 + add2 + left;
            left = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            tail.next = newNode;
            tail = newNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }


}
