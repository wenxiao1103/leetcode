package com.leetcode.test;

public class Problem61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
//    public ListNode rotateRight(ListNode head, int k) {
//        // base cases
//        if (head == null) return null;
//        if (head.next == null) return head;
//
//        ListNode old_tail = head;
//        int n;
//        for(n = 1; old_tail.next != null; n++)
//            old_tail = old_tail.next;
//        old_tail.next = head;
//
//        ListNode new_tail = head;
//        for (int i = 0; i < n - k % n - 1; i++)
//            new_tail = new_tail.next;
//        ListNode new_head = new_tail.next;
//
//        new_tail.next = null;
//
//        return new_head;
//    }
    public static ListNode rotateRight(ListNode head, int k){
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode oldTail = head;
        int n = 0;
        while(oldTail.next != null){
            oldTail = oldTail.next;
            n++;
        }
        oldTail.next = head;

        ListNode newTail = head;
        for(int i = 0; i < n-k%n-1; i++){
            newTail = newTail.next;
        }//这是算法核心
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
