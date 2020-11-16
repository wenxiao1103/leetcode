package com.leetcode.test;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/9/12 4:37 下午
 *
 * 1574. 删除最短的子数组使剩余数组有序
 */
public class Problem1574 {
//    public int findLengthOfShortestSubarray(int[] arr) {
//        int n = arr.length;
//        int left = 0;
//        while (left + 1 < n && arr[left] <= arr[left+1]) {
//            left++;
//        }
//        if (left == n - 1) {
//            return 0;
//        }
//        int right = n - 1;
//        while (right > 0 && arr[right - 1] <= arr[right]) {
//            right--;
//        }
//        int result = Math.min(n - left - 1, right);
//        int i = 0, j = right;
//
//        while (i <= left && j <= n - 1) {
//            if (arr[i] <= arr[j]) {
//                result = Math.min(result, j - i - 1);
//                i++;
//            } else {
//                j++;
//            }
//        }
//        return result;
//    }
    public int findLengthOfShortestSubarray(int[] arr){
        int n = arr.length;
        int left = 0;
        while (left < n - 1 && arr[left] <= arr[left+1]) left++;
        if (left == n - 1) return 0;
        int right = n - 1;
        while (right > 0 && arr[right-1] <= arr[right]) right--;
        int result = Math.min(n-left - 1, right);
        int i = 0;
        int j = right;
        while ( i <= left && j <= n -1) {
            if (arr[i] <= arr[j]) {
                result = Math.min(j-i-1, result);
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
}
