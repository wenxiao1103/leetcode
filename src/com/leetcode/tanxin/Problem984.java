package com.leetcode.tanxin;
//不含AAA或者BBB的字符串
public class Problem984 {
//    public String strWithout3a3b(int A, int B) {
//        StringBuilder sb=new StringBuilder();
//        while (A>0&&B>0){
//            if (A>B){
//                sb.append("aab");
//                A-=2;B-=1;
//            }else if (A==B){
//                for (int i=0;i<A;i++) sb.append("ab");
//                A=0;B=0;
//            }else{
//                sb.append("bba");
//                A-=1;B-=2;
//            }
//        }
//        if (A==0){
//            for (int i=0;i<B;i++) sb.append("b");
//        }else{
//            for (int i=0;i<A;i++) sb.append("a");
//        }
//        return sb.toString();
//    }
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        while (A > 0 && B > 0) {
            if (A > B){
                sb.append("aab");
                A -= 2;
                B -= 1;
            }else if (A == B){
                for (int i = 0; i < A; i++) sb.append("ab");
                A = 0;
                B = 0;
            }else {
                sb.append("bba");
                A -= 1;
                B -= 2;
            }
        }
        if (A == 0) {
            for (int i = 0; i < B; i++) {
                sb.append("b");
            }
        }else{
            for (int i = 0; i < A; i++) {
                sb.append("a");
            }
        }
        return sb.toString();
    }//贪心算法尽量多的去消耗a或者b的数量
    //当A大于B是，添加aab，当A小于B时，添加bba，当A等于B时，添加ab
}
