package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestProblem56 {
//    public static void main(String[] args){
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{1,2});
//        list.add(new int[]{4,7});
//        int[] peek = list.get(list.size()-1);
//        peek[1] = 9;
//        int[] res = list.get(list.size()-1);
//        System.out.println(res[1]);
////        这是一个问题？
//    }
    public static void main(String[] args){
        int[][] nums = {{1,8}, {4,6}, {7,9}, {2,5}};
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i][0]+"-"+nums[i][1]);
        }
    }
}
