package com.leetcode;

public class SortProblem {
//     public static void quicksort(int[] array, int left, int right) {
//        if (left > right) {
//            return;
//        }
//        int base = array[left];
//        int i = left, j = right;
//        while (i < j) {
//            while (array[j] >= base && i < j) {
//                j--;
//            }
//            while (array[i] <= base && i < j) {
//                i++;
//            }
//            if (i < j) {
//                 int tmp = array[i];
//                 array[i] = array[j];
//                 array[j] = tmp;
//            }
//        }
//        array[left] = array[i];
//        array[i] = base;
//        quicksort(array, left, i - 1);
//        quicksort(array, i + 1, right);
//    }
    public static void quicksort(int[] array, int low, int high) {
        if(low > high) return;
        int left = low;
        int right = high;
        int base = array[low];
        while(left < right) {
            while (right > left && array[right] >= base) right--;
            while(left < right && array[left] <= base) left++;
            //快速排序要先从右边比较移动，左边有问题
            if(left < right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        array[low] = array[left];
        array[left] = base;
        quicksort(array, low, left-1);
        quicksort(array, left + 1, high);
    }
    public static void main(String[] args) {
        int[] arrray = {1,5,2,3,9,7,6,4,8};
        quicksort(arrray, 0, arrray.length-1);
        for (int i = 0; i < arrray.length; i++) {
            System.out.println(arrray[i]);
        }
    }

}
