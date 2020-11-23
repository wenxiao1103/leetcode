package com.learing.designMode.decorator;

/**
 * @author xiaowen
 * @date 2020/11/17 11:06 上午
 */
//抽象装饰角色
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component)
    {
        this.component=component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
