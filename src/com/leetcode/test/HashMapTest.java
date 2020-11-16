package com.leetcode.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
    public static void main(String[] args){
        concurrentHashMapTest();
    }
    public static void hashMapTest(){
        HashMap hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1,1);
        hashMap.put(2,2);
        System.out.println(hashMap.toString());
    }
    public static void concurrentHashMapTest(){
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, 2);
        System.out.println(concurrentHashMap.toString());
    }
}
