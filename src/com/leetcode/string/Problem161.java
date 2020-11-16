package com.leetcode.string;
//相隔为1的编辑距离
public class Problem161 {
//    public boolean isOneEditDistance(String s, String t) {
//        int ns = s.length();
//        int nt = t.length();
//        //交换
//        if (ns > nt)
//            return isOneEditDistance(t, s);
//        //长度差超过1
//        if (nt - ns > 1)return false;
//        //找到不同的字符
//        for (int i = 0; i < ns; i++)
//            if (s.charAt(i) != t.charAt(i))
//                //如长度不同，那么两字符串后面应该相同
//                if (ns == nt)
//                    return s.substring(i + 1).equals(t.substring(i + 1));
//                    //如长度不同，那么必须在s[i]插入t[i]，所以要保证s.substring(i).equals(t.substring(i + 1))
//                else
//                    return s.substring(i).equals(t.substring(i + 1));
//        return (ns + 1 == nt);
//    }
    public boolean isOneEditDistance(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        if (ns > nt) {
            return isOneEditDistance(t, s);
        }
        if (nt - ns > 1) return false;
        for (int i = 0; i < ns; i++) {
            if (s.charAt(i) != t.charAt(i))
                if (ns == nt)
                    return s.substring(i+1).equals(t.substring(i+1));
                else
                    return s.substring(i).equals(t.substring(i+1));
        }
        return (ns+1 == nt);
    }
    //substring(i),表示是从i到末尾
    //首先判断，两个字符串的长度差是否大于1，大于1则不能通过编辑转换得到
    //选择短字符串进行遍历for循环
    //当遇到一个位置两个字符串的不同时，判断后面字符串是否相同，不同表示不能通过编辑距离为1，相同则表示可以
}
