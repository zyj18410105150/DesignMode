package com.zhangyingjie.DesignMode.StrategyMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class BlackEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
