package com.leetcode.test;
/**
 *
 * 477.汉明距离总和
 *
 */

public class Problem477 {
//    public int totalHammingDistance(int[] nums) {
//        int num=0;
//        int len = nums.length;
//        for(int i=0;i<32;i++){
//
//            int count=0;
//            for(int j=0;j<len;j++){
//
//                count+=(nums[j]>>i)&1;
//            }
//            num+=count*(len-count);
//
//        }
//
//
//        return num;
//    }
//    public int totalHamingDistance(int[] nums) {
//        int num = 0;
//        int len = nums.length;
//        for (int i = 0; i < 32; i++) {
//            int count = 0;
//            for (int j = 0; j < len; j++) {
//                count += (nums[j] >> i) & 1;
//            }
//            num += count*(len - count);
//        }
//        return num;
//    }

    //1。num用于统计汉明距离的总和
    //2.len 为数组长度，表示整数个数
    //3采用双层for循环
    //for (int i = 0; i < 32; i++) {第一个循环表示整数的二进制对应位置
    //            int count = 0;
    //            for (int j = 0; j < len; j++) {第二个循环依次遍历整数
    //                count += (nums[j] >> i) & 1;//计算二进制对应位置是否为1
    //            }
    //            num += count*(len - count);//统计二进制为1的总和
    //        }
}
