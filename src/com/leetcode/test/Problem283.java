package com.leetcode.test;
//移动0
public class Problem283 {
    public void moveZeroes(int[] nums) {
        for (int index = 0, cur = 0; cur < nums.length; cur++) {
            if(nums[cur] != 0){
                int tmp = nums[cur];
                nums[cur] = nums[index];
                nums[index++] = tmp;
            }
        }
    }
}
