package com.leetcode.test;
//爱生气的书店老板
public class Problem1052 {
//    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
//        int satisfy = 0, max = 0;
//        for(int i = 0, win = 0; i < grumpy.length; i++){
//            if(grumpy[i] == 0){
//                satisfy += customers[i];
//            }else{
//                win += customers[i];
//            }
//            if(i >= X){
//                win -= grumpy[i-X]*customers[i-X];
//            }
//            max = Math.max(win, max);
//        }
//        return satisfy+max;
//    }
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int satisfy = 0, max = 0;
        for (int i = 0, win = 0; i < grumpy.length; i++) {
            if(grumpy[i] == 0) {
                satisfy += customers[i];
            }else {
                win += customers[i];
            }
            if (i >= X) {
                win -= grumpy[i-X]*customers[i-X];
            }//这步是关键，保证抑制生气带来的客户满意数，这个公式代表一个窗口
            max = Math.max(win, max);
        }
        return satisfy+max;
    }
}
