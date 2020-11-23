package com.learing.designMode.factory.methodFactory;

/**
 * @author xiaowen
 * @date 2020/11/22 9:51 下午
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreteProduct21();
    }
}
