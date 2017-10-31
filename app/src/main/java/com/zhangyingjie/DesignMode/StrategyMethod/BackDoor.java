package com.zhangyingjie.DesignMode.StrategyMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class BackDoor implements Strategy {
    @Override
    public void operate() {
        System.out.print("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
