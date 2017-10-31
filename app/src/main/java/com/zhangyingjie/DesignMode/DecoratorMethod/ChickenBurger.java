package com.zhangyingjie.DesignMode.DecoratorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 鸡腿堡类:被装饰者的初始状态，有些自己的简单装饰
 */

public class ChickenBurger extends Humburger{
    public ChickenBurger(){
        name="鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
