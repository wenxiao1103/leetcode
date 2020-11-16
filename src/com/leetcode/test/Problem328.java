package com.leetcode.test;
//奇偶链表
public class Problem328 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//    public ListNode oddEvenList(ListNode head) {
//        if(head == null) return null;
//        ListNode even = head.next;
//        ListNode evenHead = even;
//        ListNode odd = head;
//        while(even != null && even.next != null){
//            odd.next = even.next;
//            odd = odd.next;
//            even.next = odd.next;
//            even = even.next;
//        }
//        odd.next = evenHead;
//        return head;
//    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    //奇偶节点都创建一个指针，odd和even，循环判断条件，while（even != null && even.next != null)
}
