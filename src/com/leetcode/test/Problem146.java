package com.leetcode.test;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.tools.javac.tree.JCTree;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @author xiaowen
 * @date 2020/10/7 10:39 下午
 */
public class Problem146 {

//    class LRUCache extends LinkedHashMap<Integer, Integer> {
//        private int capacity;
//
//        public LRUCache(int capacity) {
//            super(capacity, 0.75F, true);
//            this.capacity = capacity;
//        }
//
//        public int get(int key) {
//            return super.getOrDefault(key, -1);
//        }
//
//        public void put(int key, int value) {
//            super.put(key, value);
//        }
//
//        @Override
//        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//            return size() > capacity;
//        }
//    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
}
