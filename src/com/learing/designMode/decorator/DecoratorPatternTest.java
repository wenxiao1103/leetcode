package com.learing.designMode.decorator;

/**
 * @author xiaowen
 * @date 2020/11/17 11:07 上午
 */
public class DecoratorPatternTest {
    public static void main(String[] args)
    {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
    }
}
