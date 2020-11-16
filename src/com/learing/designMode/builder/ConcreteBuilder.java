package com.learing.designMode.builder;

/**
 * @author xiaowen
 * @date 2020/11/9 7:29 下午
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA()
    {
        product.setPartA("建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartB("建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartC("建造 PartC");
    }
}
