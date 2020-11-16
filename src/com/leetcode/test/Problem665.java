package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/20 10:49 下午
 *
 * 665. 非递减数列
 */
public class Problem665 {
//    public boolean checkPossibility(int[] nums) {
//        int cnt = 0;
//        for(int i = 1; i < nums.length && cnt<=1 ; i++){
//            if(nums[i-1] > nums[i]){
//                cnt++;
//                if(i-2>=0 && nums[i-2] > nums[i]) nums[i] = nums[i-1];
//            }
//        }
//        return cnt<=1;
//    }
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i-1] > nums[i]) {
                cnt++;
                if (i-2 >= 0 && nums[i-2] > nums[i]) nums[i] = nums[i-1];//这步还不是想的很明白
            }
        }
        return cnt <= 1;
    }
}
