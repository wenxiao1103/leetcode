package com.leetcode.tanxin;
//加油站
public class Problem134 {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        int minIndex = 0;
//        for(int i=0; i<gas.length; i++){
//            sum += gas[i]-cost[i];
//            if(sum<min){
//                min = sum;
//                minIndex = i;
//            }
//        }
//        if(sum<0) return -1;
//        return minIndex==gas.length-1 ?  0 : minIndex + 1;
//    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }
        if (sum < 0) return -1;
        return minIndex == gas.length-1 ? 0 : minIndex + 1;
    }
    //依次将每一站gas[i]-cost[i]相加，其中sum最小的的加油站之后的第一个加油站为起点，也就是返回值
}
