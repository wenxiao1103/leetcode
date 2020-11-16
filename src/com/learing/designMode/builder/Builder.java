package com.learing.designMode.builder;

/**
 * @author xiaowen
 * @date 2020/11/9 7:27 下午
 */
public abstract class Builder {
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}
