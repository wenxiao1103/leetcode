package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/4 10:49 下午
 *
 * 414. 第三大的数
 */
public class Problem414 {
//    public int thirdMax(int[] nums) {
//        long first = Long.MIN_VALUE;
//        long second = Long.MIN_VALUE;
//        long third = Long.MIN_VALUE;
//        for (int num : nums) {
//            if(num>first){
//                third = second;
//                second = first;
//                first = num;
//            }else if(num>second&&num<first){
//                third = second;
//                second = num;
//            }else if(num<second&&num>third){
//                third = num;
//            }
//        }
//        return third!=Long.MIN_VALUE ? new Long(third).intValue() : new Long(first).intValue();
//    }
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num < second && num > third) {
                third = num;
            }
        }
        return third != Long.MIN_VALUE ? new Long(third).intValue() : new Long(first).intValue();
    }
}
