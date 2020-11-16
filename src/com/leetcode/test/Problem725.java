package com.leetcode.test;

import java.util.List;

/**
 * @author xiaowen
 * @date 2020/10/26 10:41 下午
 */
public class Problem725 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
//    public ListNode[] splitListToParts(ListNode root, int k) {
//        ListNode cur = root;
//        int N = 0;
//        while (cur != null) {
//            cur = cur.next;
//            N++;
//        }
//
//        int width = N / k, rem = N % k;
//
//        ListNode[] ans = new ListNode[k];
//        cur = root;
//        for (int i = 0; i < k; ++i) {
//            ListNode head = cur;
//            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
//                if (cur != null) cur = cur.next;
//            }
//            if (cur != null) {
//                ListNode prev = cur;
//                cur = cur.next;
//                prev.next = null;
//            }
//            ans[i] = head;
//        }
//        return ans;
//    }
//    public ListNode[] splitListToParts(ListNode root, int k) {
//          ListNode cur = root;
//          int N = 0;
//          while (cur != null) {
//              cur = cur.next;
//              N++;
//          }
//          int width = N / k;
//          int rem = N % k;
//          ListNode[] ans = new ListNode[k];
//          for (int i = 0; i < k; i++) {
//              ListNode head = cur;
//              for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; j++) {
//                  if (cur != null) cur = cur.next;
//              }
//              if (cur != null) {
//                  ListNode prev = cur;
//                  cur = cur.next;
//                  prev.next = null;
//              }
//              ans[i] = head;
//          }
//          return ans;
//    }
    public ListNode[] splitListToParts(ListNode root, int k) {
          ListNode cur = root;
          int N = 0;
          while (cur != null) {
              cur = cur.next;
              N++;
          }
          int width = N / k;
          int rem = N % k;
          ListNode[] ans = new ListNode[k];
          for (int i = 0; i < k; i++) {
              ListNode head = cur;
              for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; j++) {
                  if (cur != null) cur = cur.next;
              }
              if (cur != null) {
                  ListNode prev = cur;
                  cur = cur.next;
                  prev.next = null;
              }
              ans[i] = head;
          }
          return ans;
    }
}