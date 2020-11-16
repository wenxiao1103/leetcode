package com.leetcode.test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

//环形链表2，返回入环点
public class Problem142 {
    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//
//            if(fast == slow){
//                ListNode slow2 = head;
//                while(slow2 != slow){
//                    slow = slow.next;
//                    slow2 = slow2.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode slow2 = head;
                while(slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}
