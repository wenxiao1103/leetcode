package com.leetcode.test;
//颜色分类
public class Problem75 {
//    public void sortColors(int[] nums) {
//        int p0 = 0, curr = 0;
//        int p2 = nums.length - 1;
//
//        int tmp;
//        while (curr <= p2) {
//            if (nums[curr] == 0) {
//                tmp = nums[p0];
//                nums[p0++] = nums[curr];
//                nums[curr++] = tmp;
//            }
//            else if (nums[curr] == 2) {
//                tmp = nums[curr];
//                nums[curr] = nums[p2];
//                nums[p2--] = tmp;
//            }
//            else curr++;
//        }
//    }
    public void sortColors(int[] nums){
        int p0 = 0, curr = 0;
        int p2 = nums.length - 1;
        int tmp;
        while( curr <= p2) {
            if (nums[curr] == 0) {
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }else if (nums[curr] == 2){
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            }
            else  curr++;
        }
    }
    //设置两个指针，一个在左边，一个在右边，一个移动指针，移动指针遇见0就于左边指针交换，遇见1就继续移动，遇见2就于右边指针交换
}
