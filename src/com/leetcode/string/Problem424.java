package com.leetcode.string;
//替换后的最长字符串
public class Problem424 {
//    private int[] map = new int[26];
//
//    public int characterReplacement(String s, int k) {
//        if (s == null) {
//            return 0;
//        }
//        char[] chars = s.toCharArray();
//        int left = 0;
//        int right = 0;
//        int charMax = 0;
//        for (right = 0; right < chars.length; right++) {
//            int index = chars[right] - 'A';
//            map[index]++;
//            charMax = Math.max(charMax, map[index]);
//            if (right - left + 1 > charMax + k) {
//                map[chars[left] - 'A']--;
//                left++;
//            }
//        }
//        return chars.length - left;
//    }

    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        if (s == null) return 0;
        char[] chars = s.toCharArray();
        int right = 0;
        int left = 0;
        int charMax = 0;
        for (right = 0; right < chars.length; right++) {
            int index = chars[right]-'A';
            map[index]++;
            charMax = Math.max(charMax, map[index]);
            if(right-left + 1 > charMax + k) {
                map[left]--;
                left++;
            }
        }
        return chars.length - left;
    }
    //map作为滑动窗口，charMax表示窗口内数量最多的字母数量，当charMax+k > right-left+1时，表示不是最大字符串
    //故left++;
}
