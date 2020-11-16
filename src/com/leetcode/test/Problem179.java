package com.leetcode.test;

import java.util.Arrays;
import java.util.Comparator;

//最大数
//给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
public class Problem179 {
//    public String largestNumber(int[] nums){
//        String[] strs=new String[nums.length];
//        for(int i=0 ; i<nums.length ; i++) strs[i]=Integer.toString(nums[i]);
//        Arrays.sort(strs,new Comparator<String>(){
//            @Override
//            public int compare(String s1,String s2){
//                if(s1.length()==s2.length()) return s2.compareTo(s1);
//                return (s2+s1).compareTo(s1+s2);
//            }
//        });
//        if("0".equals(strs[0])) return "0";
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<strs.length;i++){
//            sb.append(strs[i]);
//        }
//        return sb.toString();
//    }
    public String largestNumber(int[] nums){
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if("0".equals(strs[0])) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
    //把整数数组变为字符串数组，然后排序，在通过StringBuilder添加，最后toString()输出
}
