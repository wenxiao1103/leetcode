package com.leetcode.test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

//反转链表2，反转m到n的链表
public class Problem92 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        if(head == null || m >= n) return head;
//        ListNode cur = head, prev = null;
//        while(m > 1){
//            prev = cur;
//            cur = cur.next;
//            m--;
//            n--;
//        }
//
//        ListNode con = prev, third = null;
//        ListNode tail = cur;
//
//        while(n > 0){
//            third = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = third;
//            n--;
//        }
//        if(con != null){
//            con.next = prev;
//        }else{
//            head = prev;
//        }
//
//        tail.next = cur;
//        return head;
//    }
    public ListNode reverseBetween(ListNode head, int m, int n){
        if(head == null || m > n) return head;
        ListNode prev = null, cur = head;
        while( m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = prev;
        ListNode tail = cur;
        ListNode next = null;
        while( n > 0) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            n--;
        }

        if(con != null){
            con.next = prev;
        }else {
            head = prev;
        }
        tail.next = cur;
        return head;
    }
    //首先找到要反转的那部分的头部，以while(n > 0)循环，最后cur就在要反转部分最后一个节点之后的节点上
}
