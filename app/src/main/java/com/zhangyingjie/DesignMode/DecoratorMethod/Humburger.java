package com.zhangyingjie.DesignMode.DecoratorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 汉堡基类:被装饰者
 */

public abstract class Humburger {
    protected String name;

    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
