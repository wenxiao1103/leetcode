package com.leetcode.test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/8/30 8:16 下午
 *
 * 1171. 从链表中删去总和值为零的连续节点
 */
public class Problem1171 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
//    public ListNode removeZeroSumSublists(ListNode head) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        Map<Integer, ListNode> map = new HashMap<>();
//        int sum = 0;
//        for (ListNode d = dummy; d != null; d = d.next) {
//            sum += d.val;
//            map.put(sum, d);
//        }
//
//        sum = 0;
//        for (ListNode d = dummy; d != null; d = d.next) {
//            sum += d.val;
//            d.next = map.get(sum).next;
//        }
//        return dummy.next;
//    }
    public ListNode removeZeroSumlists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode d = dummy; d != null; d = d.next) {
            sum += d.val;
            map.put(sum, d);
        }
        sum = 0;
        for (ListNode d = dummy; d != null; d = d.next) {
            sum += d.val;
            d.next = map.get(sum).next;
        }
        return dummy.next;
    }
}
