package com.learing.designMode.templateMethod;

/**
 * @author xiaowen
 * @date 2020/11/17 10:40 下午
 */
public class ConcreteClass  extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
