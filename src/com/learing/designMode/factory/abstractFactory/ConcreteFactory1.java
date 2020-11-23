package com.learing.designMode.factory.abstractFactory;

/**
 * @author xiaowen
 * @date 2020/11/22 9:41 下午
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
