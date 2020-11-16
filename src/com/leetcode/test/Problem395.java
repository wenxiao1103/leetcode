package com.leetcode.test;
//至少有k个重复字符的最长子串
public class Problem395 {
//    public int longestSubstring(String s, int k) {
//        if(s == null) return 0;
//        int res = 0;
//        for(int i=1; i<=26; i++){
//            res = Math.max(res, longestKUniqueRepeatingCharacter(s, k, i));
//        }
//        return res;
//    }
//    public int longestKUniqueRepeatingCharacter(String s, int k, int cNum){
//        int low = 0, high = 0;
//        int[] repeatNum = new int[26];
//        int uniqueCNum = 0;
//        int uniqueKNum = 0;
//        int res = 0;
//
//        while(high < s.length()){
//            Character c = s.charAt(high);
//            if(repeatNum[c-'a']++ == 0)
//                uniqueCNum++;
//            if(repeatNum[c-'a'] == k)
//                uniqueKNum++;
//            while(uniqueCNum>cNum){
//                Character cl = s.charAt(low);
//                if(repeatNum[cl-'a']-- == k){
//                    uniqueKNum--;
//                }
//                if(repeatNum[cl-'a'] == 0){
//                    uniqueCNum--;
//                }
//                low++;
//            }
//            high++;
//            if(uniqueCNum == cNum && uniqueCNum == uniqueKNum){
//                res = Math.max(high-low, res);
//            }
//        }
//        return res;
//    }
//    public int longestSubstring(String s, int k) {
//        if (s == null) return 0;
//        int res = 0;
//        for (int i = 1; i <= 26; i++) {
//            res = Math.max(res, longestKUniqueRepeatingCharacter(s, k, i));
//        }
//        return res;
//    }
//    public int longestKUniqueRepeatingCharacter(String s, int k, int cNum){
//        int low = 0, high = 0;
//        int[] repeatCNum = new int[26];
//        int uniqueCNum = 0;
//        int uniqueKNum = 0;
//        int res = 0;
//        while(high < s.length()) {
//            Character c = s.charAt(high);
//            if (repeatCNum[c-'a']++ == 0) uniqueCNum++;
//            if (repeatCNum[c-'a'] == k) uniqueKNum++;
//            while (uniqueCNum > cNum){
//                Character cl = s.charAt(low);
//                if(repeatCNum[cl-'a']-- == k){
//                    uniqueCNum--;
//                }
//            }
//        }
//    }

//    public int longestSubstring(String s, int k) {
//        int len=s.length();
//        if(len<k)return 0;
//        return dtgh(s.toCharArray(),k,0,len);
//    }
//    public int dtgh(char[] chars, int k, int p1, int len){
//        if (len - p1 < k) return 0;
//        int[] times=new int[26];
//        for(int i=p1;i<len;i++){
//            times[chars[i]-'a']++;
//
//        }
//        for(int i=p1;i<len;i++){
//            if(times[chars[i]-'a']<k){
//                return Math.max(dtgh(chars,k,p1,i),dtgh(chars,k,i+1,len));
//            }
//        }
//
//        return len-p1;
//    }
    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len < k) return 0;
        return dtgh(s.toCharArray(), k, 0, len);
    }
    public int dtgh(char[] chars, int k, int p1, int len) {
        if (len - p1 < k) return 0;
        int[] times = new int[26];
        for (int i = p1; i< len; i++) {
            times[chars[i] - 'a']++;
        }
        for (int i = p1; i < len; i++) {
            if (times[chars[i] - 'a'] < k) {
                return Math.max(dtgh(chars, k, p1, i), dtgh(chars, k, i+1, len));
            }
        }
        return len-p1;
    }
}
