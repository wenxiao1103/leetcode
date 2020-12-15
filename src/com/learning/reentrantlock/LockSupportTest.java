package com.learning.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author xiaowen
 * @date 2020/12/10 3:06 下午
 */
public class LockSupportTest {
//    public static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println(getName() + " 进入线程");
//            LockSupport.park();
//            System.out.println("t1线程运行结束");
//        }
//    }
    public static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " 进入线程");
            LockSupport.park();
            System.out.println(" 运行结束");
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("t1已经启动，但是在内部进行了park");
        LockSupport.unpark(t1);
        System.out.println("LockSupport进行了unpark");
    }

//    public static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println(getName() + " 进入线程");
//            LockSupport.park();
//            System.out.println(" 运行结束");
//            System.out.println("是否中断：" + Thread.currentThread().isInterrupted());
//        }
//    }
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        System.out.println("t1线程已经启动了，但是在内部LockSupport进行了park");
//        t1.interrupt();
//        System.out.println("main线程结束");
//    }

    /**
     * 调用interrupt()方法，立刻改变的是中断状态，但如果不是在阻塞态，就不会抛出异常；如果在进入阻塞态后，中断状态为已中断，就会立刻抛出异常
     */
}
