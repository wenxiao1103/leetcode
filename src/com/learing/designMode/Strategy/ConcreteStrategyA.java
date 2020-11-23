package com.learing.designMode.Strategy;

/**
 * @author xiaowen
 * @date 2020/11/22 8:55 下午
 */
//具体策略类A
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
