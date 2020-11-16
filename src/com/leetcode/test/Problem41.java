package com.leetcode.test;
//缺失的整数
public class Problem41 {
    /*public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int contains = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                contains++;
                break;
            }
        }
        if(contains == 0)
            return 1;
        if(n == 1)
            return 2;
        for(int i = 0; i < n; i++){
            if((nums[i] <= 0) || (nums[i] > n))
                nums[i] = 1;
        }
        for(int i = 0; i < n; i++){
            int a = Math.abs(nums[i]);
            if(a == n)
                nums[0] = -Math.abs(nums[0]);
            else
                nums[a] = -Math.abs(nums[a]);
        }
        for(int i = 1; i < n; i++){
            if(nums[i] > 0)
                return i;
        }
        if(nums[0] > 0)
            return n;
        return n+1;
    }*/
   /* public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }*/
   //通过置换的方式，将小于数组长度的整数换到数组中正确的位置，当有一个数不在正确的位置，那么该位置正确的数就是缺失的数
   public int firstMissingPositive(int[] nums){
       int n = nums.length;
       for(int i = 0; i < n; i++){
           while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1]){
               int temp = nums[nums[i]-1];
               nums[nums[i]-1] = nums[i];
               nums[i] = temp;
           }
       }
       for(int i = 0; i < n; i++){
           if(nums[i] != i+1){
               return i+1;
           }
       }
       return n+1;
   }
}