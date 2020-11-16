package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/4 10:55 下午
 *
 * 215. 数组中的第K个最大元素
 */
public class Problem215 {
//    public int findKthLargest(int[] nums, int k) {
//        return quickSelect(nums,k - 1, 0, nums.length - 1);
//    }
//    public int quickSelect(int[] arr, int k, int left, int right) {
//        int base = arr[(left+right)/2];
//        int orgL = left, orgR = right;
//        while(left <= right){
//            while(arr[left] > base) left++;
//            while(arr[right] < base) right--;
//            if(left <= right){
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//        }
//        if (orgL < right && k <= right) return quickSelect(arr, k, orgL, right);
//        if (orgR > left && k >= left) return quickSelect(arr, k, left, orgR);
//        return arr[k];
//    }
//    private void swap(int[] arr, int idx1, int idx2){
//        int tmp = arr[idx1] + arr[idx2];
//        arr[idx1] = tmp - arr[idx1];
//        arr[idx2] = tmp - arr[idx2];
//    }
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k-1, 0, nums.length-1);
    }
    public int quickSelect(int[] arr, int k, int left, int right) {
        int base = arr[(left + right)/2];
        int orgL = left, orgR = right;
        while (left <= right) {
            while (arr[left] > base) left++;
            while (arr[right] < base) right--;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        if (orgL < right && k <= right) return quickSelect(arr, k, orgL, right);
        if (orgR > left && k >= left) return quickSelect(arr, k, left, orgR);
        return arr[k];
    }
    public void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1] + arr[idx2];
        arr[idx1] = tmp - arr[idx1];
        arr[idx2] = tmp - arr[idx2];
    }
}
