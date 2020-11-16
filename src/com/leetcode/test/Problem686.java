package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/10/11 9:25 下午
 *
 * 686. 重复叠加字符串匹配
 */
public class Problem686 {
//    public int repeatedStringMatch(String a, String b) {
//        //筛一下稍微快一点，这个if可以不写
//        if(a.contains(b)){
//            return 1;
//        }
//        int min = b.length()/a.length();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 1; i <= min+2; i++){
//            sb.append(a);
//            if(i>=min && sb.toString().contains(b)){
//                return i;
//            }
//        }
//
//        return -1;
//    }
    public int repeatedStringMatch(String a, String b) {
        if (a.contains(b)) {
            return 1;
        }
        int min = b.length() / a.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= min + 2; i++) {
            sb.append(a);
            if (i >= min && sb.toString().contains(b)) {
                return i;
            }
        }
        return -1;
    }
}
