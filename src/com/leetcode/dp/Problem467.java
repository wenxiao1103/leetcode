package com.leetcode.dp;
//环绕字符串中唯一的子字符串,采用动态规划
public class Problem467 {
//    public int findSubstringInWraproundString(String p){
//        int[] pSize = new int[p.length()];
//        //保存字符串p里有哪些字母
//        int[] count = new int[26];
//        //以每个字母为末尾的子字符串的数量
//        for(int i = 0; i < p.length(); i++){
//            pSize[i] = (int)(p.charAt(i)-'a');
//        }
//        int num = 0;
//        int sum = 0;
//        for(int i = 0; i < pSize.length; i++){
//            if(i > 0 && (pSize[i-1]+1) % 26 == pSize[i]){
//                //判断字母是否是顺序连在一起的
//                num++;
//            }else{
//                num = 1;
//            }
//            count[pSize[i]] = Math.max(count[pSize[i]], num);
//        }
//        for(int i = 0; i < 26; i++){
//            sum += count[i];
//        }
//        return sum;
//    }
    public int findSubstringInWraproundString(String p) {
        int[] pSize = new int[p.length()];
        int[] count = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pSize[i] = (int)(p.charAt(i) - 'a');
        }
        int num = 0;
        for (int i = 0; i < pSize.length; i++) {
            if (i > 0 && (pSize[i-1] + 1) % 26 == pSize[i]){
                num++;
            }else {
                num = 1;
            }
            count[pSize[i]] = Math.max(count[pSize[i]], num);
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i];
        }
        return sum;
    }
    //1.用pSize整数数组表示字符串p
    //2。用整数数组count表示以字母count[i]为末尾的子字符串的数量
    //3。for循环依次遍历字符串数组pSize
    //4。在for循环里判读字母是否是顺序连在一起的
    //if (i > 0 && (pSize[i-1] + 1) % 26 == pSize[i]) {
    //                num++;
    //            }else{
    //                num = 1;
    //            }
    //判断以count[pSize[i]]中pSize[i]结尾的字符串数量count[pSize[i]] = Math.max(count[pSize[i]], num);
    //5。最后将count数量相加，为返回结果
}
