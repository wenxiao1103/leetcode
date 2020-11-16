package com.leetcode.test;
//删除排序字符链表中的重复字符
public class Problem83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
