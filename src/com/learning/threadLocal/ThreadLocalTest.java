package com.learning.threadLocal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/10/21 3:21 下午
 */
public class ThreadLocalTest {
    /*定义一个全局变量 来存放线程需要的变量*/
//    public static ThreadLocal<Integer> ti = new ThreadLocal<Integer>();
//
//    public static void main(String[] args) {
//        /*创建两个线程*/
//        for (int i = 0; i < 2; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    Double d = Math.random() * 10;
//                    /*存入当前线程独有的值*/
//                    ti.set(d.intValue());
//                    new A().get();
//                    new B().get();
//                }
//            }).start();
//        }
//    }
//
//    static class A {
//        public void get() {
//            /*取得当前线程所需要的值*/
//            System.out.println(ti.get());
//        }
//    }
//
//    static class B {
//        public void get() {
//            /*取得当前线程所需要的值*/
//            System.out.println(ti.get());
//        }
//    }
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Double d = Math.random()*10;
                    threadLocal.set(d.intValue());
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
    static class A {
        public void get() {
            System.out.println(threadLocal.get());
        }
    }
    static class B {
        public void get() {
            System.out.println(threadLocal.get());
        }
    }
}
