package com.leetcode.test;
//移动0，将所有0移动到末尾，并保持相对位置不变
public class Problem238 {
//    public void moveZeroes(int[] nums) {
//        for(int index = 0, cur = 0; cur < nums.length; cur++){
//            if(nums[cur] != 0){
//                int tmp = nums[index];
//                nums[index] = nums[cur];
//                nums[cur] = tmp;
//                index++;
//            }
//        }
//    }
    public void moveZeroes(int[] nums) {
        for (int index = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int tmp = nums[cur];
                nums[index] = nums[cur];
                nums[cur] = tmp;
                index++;
            }
        }
    }
    //使用两个指针，一个依次移动不管是什么数index，一个依次遍历数组cur，当这个指针遇见非零数就于第一指针的数交换
    //采用这样的方法就能保证相对位置不变
}
