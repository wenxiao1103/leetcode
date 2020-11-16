package com.leetcode.test;
//分割链表
//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
//你应当保留两个分区中每个节点的初始相对位置。
public class Problem86 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
//    public ListNode partition(ListNode head, int x){
//        ListNode before_head = new ListNode(0);
//        ListNode before = before_head;
//        ListNode after_head = new ListNode(0);
//        ListNode after = after_head;
//
//        while(head != null){
//            if(head.val < x){
//                before.next = head;
//                before = before.next;
//            }else{
//                after.next = head;
//                after = after.next;
//            }
//
//            head = head.next;
//        }
//        after.next = null;
//        before.next = after_head.next;
//
//        return before_head.next;
//    }
    public ListNode partition(ListNode head, int x){
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while(head != null) {
            if(head.val < x){
                before.next = head;
                before = before.next;
            }else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }
    //创建两个链表，一个用于存储小于x的节点，一个用于存储大于等于x的节点
}
