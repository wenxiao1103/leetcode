package com.learing.designMode.builder;

/**
 * @author xiaowen
 * @date 2020/11/9 7:31 下午
 */
public class Client {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
