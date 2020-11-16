package com.leetcode.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author xiaowen
 * @date 2020/8/30 2:53 下午
 *
 * 386.字典序排序
 */
public class Problem386 {
//    public List<Integer> lexicalOrder(int n) {
//        Set<String> set=new TreeSet<>();
//        for(int i=1;i<=n;i++){
//            set.add(String.valueOf(i));
//        }
//        return set.stream().map(Integer::valueOf).collect(Collectors.toList());
//    }
    public List<Integer> lexicalOrder(int n) {
        Set<String> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(String.valueOf(i));
        }
        return set.stream().map(Integer::valueOf).collect(Collectors.toList());
    }
}
