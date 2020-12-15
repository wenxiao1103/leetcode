package com.leetcode.test;

import java.util.List;

//k个一组翻转链表
public class Problem25 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    /*public ListNode reverseKGroup(ListNode head, int k){
        if(k < 2){
            return head;
        }
        ListNode cur = head;
        ListNode start = null;
        ListNode pre = null;
        ListNode next = null;
        int count = 1;
        while(cur != null){
            next = cur.next;
            if(count == k){
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                resign2(pre, start, cur, next);
                pre = start;
                count = 0;
            }
            count++;
            cur = next;
        }
        return head;
    }*/
//    public ListNode reverseKGroup(ListNode head, int k){
//        if(k < 2) return head;
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode start = null;
//        ListNode next = null;
//        int count = 1;
//        while (cur != null) {
//            next = cur.next;
//            if(count == k){
//                start = pre == null ? head:pre.next;
//                head = pre == null ? head:pre.next;
//                resign2(pre, start, cur, next);
//                pre = start;
//                count = 0;
//            }
//            cur = next;
//            count++;
//        }
//        return head;
//    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode start = head;
        ListNode next = null;
        int count = 1;
        while (cur != null) {
            next = cur.next;
            if (count == k) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                resign2(pre, start, cur, next);
                pre = start;
                count = 0;
            }
            cur = next;
            count++;
        }
        return head;
    }
    /*public void resign2(ListNode left, ListNode start, ListNode end, ListNode right){
        ListNode pre = start;
        ListNode cur = start.next;
        ListNode next = null;
        while(cur != right){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if(left != null){
            left.next = end;
        }
        start.next = right;
    }*/
//    public void resign2(ListNode left, ListNode start, ListNode end, ListNode right){
//        ListNode pre = start;
//        ListNode cur = start.next;
//        ListNode next = null;
//
//        while (cur != right) {
//            next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        if (left != null) {
//            left.next = end;
//        }
//        start.next = right;
//    }
    public void resign2(ListNode left, ListNode start, ListNode end, ListNode right) {
        ListNode pre = start;
        ListNode cur = start.next;
        ListNode next = null;
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if (left != null) {
            left.next = end;
        }
        start.next = right;
    }
}
