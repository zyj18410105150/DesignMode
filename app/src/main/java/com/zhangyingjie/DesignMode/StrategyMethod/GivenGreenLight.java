package com.zhangyingjie.DesignMode.StrategyMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class GivenGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
