package com.leetcode.test;
//盛最多水的容器
public class Problem11 {
    public static void main(String[] args){
        int[] a = {1,8,6,2,5,4,8,3,7};
        int maxarea = maxArea(a);
        System.out.println("最大面积为"+maxarea);
    }
    //指针
    public static int maxArea(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length-1;
        while (l < r){
            maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
