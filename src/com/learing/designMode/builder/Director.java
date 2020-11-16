package com.learing.designMode.builder;

/**
 * @author xiaowen
 * @date 2020/11/9 7:31 下午
 */
public class Director {
    private Builder builder;
    public Director(Builder builder)
    {
        this.builder=builder;
    }
    //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
