package com.leetcode.test;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/8/30 9:23 下午
 *
 * 1156. 单字符重复子串的最大长度
 */
public class Problem1156 {
//    public int maxRepOpt1(String text) {
//        int len = text.length();
//        int[] ch_count = new int[26];
//        //统计26个小写字母各自出现的次数
//        for (int i = 0; i < len; ++i)
//            ++ch_count[text.charAt(i) - 'a'];
//        char last_ch = text.charAt(0);
//        int count = 1, res = 1;
//        for (int i = 1; i < len; ++i) {
//            if (last_ch != text.charAt(i)) {
//                int temp_idx = i;
//                while (temp_idx + 1 < len && last_ch == text.charAt(temp_idx + 1)) {
//                    ++count;
//                    ++temp_idx;
//                }
//                if (ch_count[last_ch - 'a'] > count)
//                    ++count;
//                res = Math.max(res, count);
//                count = 1;
//                last_ch = text.charAt(i);
//            } else
//                ++count;
//        }
//        if (count > 1 && ch_count[last_ch - 'a'] > count)
//            ++count;
//        return Math.max(res, count);
//    }
    public int maxRepOpt1(String text) {
        int len = text.length();
        int[] ch_count = new int[26];
        for (int i = 0; i < len; i++) {
            ch_count[text.charAt(i) - 'a']++;
        }
        char last_ch = text.charAt(0);
        int count = 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            if (last_ch != text.charAt(i)) {
                int temp_idx = i;
                while (temp_idx + 1 < len && last_ch == text.charAt(temp_idx + 1)) {
                    count++;
                    temp_idx++;
                }
                if (ch_count[last_ch - 'a'] > count)
                    count++;
                res = Math.max(res, count);
                count = 1;
                last_ch = text.charAt(i);
            }else {
                count++;
            }
        }
        if (count > 1 && ch_count[last_ch - 'a'] > count)
            count++;
        return Math.max(res, count);
    }
}
