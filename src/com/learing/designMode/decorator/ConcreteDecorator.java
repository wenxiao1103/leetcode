package com.learing.designMode.decorator;

/**
 * @author xiaowen
 * @date 2020/11/17 11:07 上午
 */

//具体装饰角色
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation()
    {
        super.operation();
        addedFunction();
    }
    public void addedFunction()
    {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
