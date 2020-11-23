package com.learing.designMode.factory.abstractFactory;

/**
 * @author xiaowen
 * @date 2020/11/22 9:41 下午
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
