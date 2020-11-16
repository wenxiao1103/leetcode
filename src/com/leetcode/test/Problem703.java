package com.leetcode.test;

import com.sun.deploy.security.BadCertificateDialog;

import java.util.PriorityQueue;

/**
 * @author xiaowen
 * @date 2020/10/21 10:23 下午
 *
 * 703. 数据流中的第K大元素
 */
public class Problem703 {
//    public class KthLargest{
//        private java.util.PriorityQueue<Integer> PriorityQueue;
//        private int fixed_k;
//
//        // KthLargest 创建一个最小堆，写入k个大的元素
//        public KthLargest(int k, int[] nums) {
//            fixed_k = k;
//            PriorityQueue = new PriorityQueue<>(k);
//            for (int val : nums) add(val);
//        }
//
//        public int add(int val) {
//            // size小于k，直接放入
//            if (PriorityQueue.size() < fixed_k) {
//                PriorityQueue.add(val);
//            } else if (val > PriorityQueue.peek()) {
//                // val大于队首元素，则删除队首 添加val
//                PriorityQueue.poll();
//                PriorityQueue.add(val);
//            }
//            // PriorityQueue中保存k个大的元素，PriorityQueue中队首元素就是第k个元素
//            return PriorityQueue.peek();
//        }
//    }
    public class KthLargest {
       private PriorityQueue<Integer> priorityQueue;
       private int fixed_k;
       public KthLargest(int k, int[] nums) {
           fixed_k = k;
           priorityQueue = new PriorityQueue<>(k);
           for (int val : nums) add(val);
       }
       public int add(int val) {
           if (priorityQueue.size() < fixed_k) {
               priorityQueue.add(val);
           } else if (val > priorityQueue.peek()) {
               priorityQueue.poll();
               priorityQueue.add(val);
           }
           return priorityQueue.peek();
       }
    }
}
