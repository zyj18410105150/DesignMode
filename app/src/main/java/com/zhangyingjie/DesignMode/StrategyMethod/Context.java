package com.zhangyingjie.DesignMode.StrategyMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
