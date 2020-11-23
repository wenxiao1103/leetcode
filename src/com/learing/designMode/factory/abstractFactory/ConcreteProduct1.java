package com.learing.designMode.factory.abstractFactory;

/**
 * @author xiaowen
 * @date 2020/11/22 9:35 下午
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
