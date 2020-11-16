package com.leetcode.tanxin;

import java.util.HashMap;
import java.util.zip.CheckedOutputStream;

/**
 * @author xiaowen
 * @date 2020/10/11 3:56 下午
 *
 * 659. 分割数组为连续子序列
 */
public class Problem659 {
//    class Solution {
//        public boolean isPossible(int[] nums) {
//            Counter count = new Counter();
//            Counter tails = new Counter();
//            for (int x : nums) count.add(x, 1);
//            for (int x : nums) {
//                if (count.get(x) == 0) {
//                    continue;
//                } else if (tails.get(x) > 0) {
//                    tails.add(x, -1);
//                    tails.add(x + 1, 1);
//                } else if (count.get(x + 1) > 0 && count.get(x + 2) > 0) {
//                    count.add(x + 1, -1);
//                    count.add(x + 2, -1);
//                    tails.add(x + 3, 1);
//                } else {
//                    return false;
//                }
//                count.add(x, -1);
//            }
//            return true;
//        }
//    }
//
//    class Counter extends HashMap<Integer, Integer> {
//        public int get(int k) {
//            return containsKey(k) ? super.get(k) : 0;
//        }
//
//        public void add(int k, int v) {
//            put(k, get(k) + v);
//        }
//    }
//    public class Solution{
//        public boolean isPossible(int[] nums) {
//            Counter count = new Counter();
//           Counter tails = new Counter();
//            for (int num : nums) count.add(num, 1);
//            for (int num : nums) {
//                if (count.get(num) == 0) continue;
//                else if (tails.get(num) > 0) {
//                    tails.add(num, -1);
//                    tails.add(num + 1, 1);
//                } else if (count.get(num + 1) > 0 && count.get(num + 2) > 0) {
//                    count.add(num + 1, -1);
//                    count.add(num + 2, -1);
//                    tails.add(num + 3, 1);
//                } else {
//                    return false;
//                }
//                count.add(num, -1);
//            }
//            return true;
//        }
//    }
//    public class Counter extends HashMap<Integer, Integer> {
//        public int get(int k) {
//            return containsKey(k) ? super.get(k) : 0;
//        }
//        public void add(int k, int v) {
//            put(k, get(k) + v);
//        }
//    }
    public class Solution {
        public boolean isPossible(int[] nums) {
            Counter count = new Counter();
            Counter tails = new Counter();
            for (int num : nums) count.add(num, 1);
            for (int num : nums) {
                if (count.get(num) == 0) continue;
                else if (tails.get(num) > 0) {
                    tails.add(num, -1);
                    tails.add(num + 1, 1);
                } else if (count.get(num + 1) > 0 && count.get(num + 2) > 0) {
                    count.add(num + 1, -1);
                    count.add(num + 2, -1);
                    tails.add(num + 3, 1);
                } else return false;
                count.add(num, -1);
            }
            return true;
        }
    }
    public class Counter extends HashMap<Integer, Integer> {
        public int get(int k) { return containsKey(k) ? super.get(k) : 0;}
        public void add(int k, int v) { put(k, get(k) + v);}
    }
}