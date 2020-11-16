package com.leetcode.test;
//整数反转
public class Problem07 {
   /* public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }*/
   public int reverse(int x) {
       long res = 0;
       while (x != 0) {
           res = res * 10 + x % 10;
           x /= 10;
       }
       return (int)res == res ? (int)res : 0;
   }

   public static void main(String[] args){
       int x = -123;
       int res = 0;
       while(x != 0){
           int tmp = x%10;
           res = res*10+tmp;
           x /= 10;
       }
       System.out.println(res);
   }
}
