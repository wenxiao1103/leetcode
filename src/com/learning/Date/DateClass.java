package com.learning.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaowen
 * @date 2020/11/20 4:44 下午
 */
public class DateClass {
    public static void main(String[] args) {
        Date d1 = new Date(2014-1900, 6-1, 12);
        Date d2 = new Date(445555555);//把一个时间戳转换成一个Date类型
        System.out.println(" d2 : {"+ d2 + ")");

        Long time = d2.getTime();// 把一个时间转换成一个时间戳
        System.out.println("time = "+time);
        System.out.println(d1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//把Date按照一定格式进行转换
        System.out.println(simpleDateFormat.format(d1));
    }
}
