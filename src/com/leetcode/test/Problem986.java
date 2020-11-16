package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

//区间列表的交集
public class Problem986 {
//    public int[][] intervalIntersection(int[][] A, int[][] B){
//        List<List<Integer>> listAll = new ArrayList<>();
//        int i = 0, j = 0;
//
//        while(i < A.length && j < B.length){
//            int lo = Math.max(A[i][0],B[j][0]);
//            int hi = Math.min(A[i][1],B[j][1]);
//            if(lo<=hi){
//                List<Integer> list = new ArrayList<>();
//                list.add(lo);
//                list.add(hi);
//                listAll.add(list);
//            }
//            if(A[i][1] < B[j][1]){
//                i++;
//            }else{
//                j++;
//            }
//        }
//        int[][] res = new int[listAll.size()][2];
//        for(int pos = 0; pos < listAll.size(); pos++){
//            res[pos][0] = listAll.get(pos).get(0);
//            res[pos][1] = listAll.get(pos).get(1);
//        }
//        return res;
//    }
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<List<Integer>> listAll = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if(lo <= hi) {
                List<Integer> list = new ArrayList<>();
                list.add(lo);
                list.add(hi);
                listAll.add(list);
            }
            if (A[i][1] < B[j][1]){
                i++;
            }else {
                j++;
            }
        }
        int[][] res = new int[listAll.size()][2];
        for (int pos = 0; pos < listAll.size(); pos++) {
            res[pos][0] = listAll.get(pos).get(0);
            res[pos][1] = listAll.get(pos).get(1);
        }
        return res;
    }
}
