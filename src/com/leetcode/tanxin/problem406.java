package com.leetcode.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/8/30 3:30 下午
 *
 * 406.根据身高重建队列
 */
public class problem406 {
//    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>(){
//            public int compare(int[] a, int[] b){
//                return a[0] != b[0]?b[0]-a[0]:a[1]-b[1];
//            }
//        });
//        List<int[]> list = new ArrayList<>();
//        for(int i = 0; i < people.length; i++){
//            list.add(people[i][1], people[i]);
//        }
//
//        for(int i = 0; i < people.length; i++){
//            people[i] = list.get(i);
//        }
//        return people;
//    }
//    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//                return a[0] != b[0] ? b[0] - a[0] : a[1] - b[1];
//            }
//        });
//        List<int[]> list = new ArrayList<>();
//        for (int i = 0; i < people.length; i++) {
//            list.add(people[i][1], people[i]);
//        }
//        return list.toArray(new int[people.length][2]);
//    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] != b[0] ? b[0]-a[0] : a[1]-b[1];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        return list.toArray(new int[people.length][2]);
    }
}
