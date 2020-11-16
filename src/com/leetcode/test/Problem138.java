package com.leetcode.test;
//复制带随机指针的链表
public class Problem138 {
    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    };
//        public Node copyRandomList(Node head) {
//            if (head == null) return null;
//            Node cur = head;
//            while (cur != null) {
//                Node next = cur.next;
//                cur.next = new Node(cur.val, next, null);
//                cur = next;
//            }
//            cur = head;
//            while (cur != null) {
//                if (cur.random != null)
//                    cur.next.random = cur.random.next;
//                cur = cur.next.next;
//            }
//            cur = head;
//            Node copyHead = head.next;
//            while (cur != null) {
//                Node next = cur.next.next;
//                Node copy = cur.next;
//                cur.next = next;
//                if (next != null)
//                    copy.next = next.next;
//                cur = next;
//            }
//            return copyHead;
//        }
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        while(cur != null) {
            Node next = cur.next;
            cur.next = new Node(cur.val, next, null);
            cur = next;
        }
        cur = head;
        while (cur != null){
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node copyHead = head.next;
        while(cur != null) {
            Node next = cur.next.next;
            Node copy = cur.next;
            cur.next = next;
            if(next != null)
                copy.next = next.next;
            cur = next;
        }
        return copyHead;
    }
    //
}
