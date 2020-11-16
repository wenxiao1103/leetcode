package com.leetcode.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xiaowen
 * @date 2020/9/16 10:30 下午
 *
 * 127.单词接龙
 */
public class Problem127 {

//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//        Queue<String> queue = new LinkedList<String>();
//        queue.add(beginWord);
//        boolean[] marked = new boolean[wordList.size()+1];
//        int layer = 1;
//        while(!queue.isEmpty()){
//            layer++;
//            int size = queue.size();
//            while(size-- > 0){
//                String cur = queue.poll();
//                for(int i = 0; i < wordList.size(); i++){
//                    if(marked[i]) continue;
//                    String dic = wordList.get(i);
//                    if(canChange(dic, cur)){
//                        if(dic.equals(endWord)) return layer;
//                        queue.add(dic);
//                        marked[i] = true;
//                    }
//                }
//            }
//        }
//        return 0;
//    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        boolean[] marked = new boolean[wordList.size()+1];
        int layer = 1;
        while (!queue.isEmpty()) {
            layer++;
            int size = queue.size();
            while (size-- > 0) {
                String cur = queue.poll();
                for (int i = 0; i < wordList.size(); i++) {
                    if (marked[i]) continue;
                    String dic = wordList.get(i);
                    if (canChange(dic, cur)) {
                        if (dic.equals(endWord)) return layer;
                        queue.add(dic);
                        marked[i] = true;
                    }
                }
            }
        }
        return 0;
    }

    public boolean canChange(String s, String t){
        int len = s.length();
        int diff = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
