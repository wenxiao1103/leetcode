package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/8/27 10:05 下午
 *
 * 1551. 使数组中所有元素相等的最小操作数
 */
public class Problem1551 {
    public int minOperations(int n) {
        int avg = 0;
        int[] arr = new int[n];
        int gap = 0;
        for(int i=0;i<n;i++){
            arr[i] = (2*i) + 1;
            avg += arr[i];
        }
        avg /= n;

        for(int i=0;i<n;i++)
            if(arr[i]<avg)
                gap += avg-arr[i];
        return gap;
    }
}
