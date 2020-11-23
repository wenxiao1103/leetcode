package com.learing.designMode.Strategy;

/**
 * @author xiaowen
 * @date 2020/11/22 8:57 下午
 */
//环境类
public class Context {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
