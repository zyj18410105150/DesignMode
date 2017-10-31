package com.zhangyingjie.DesignMode.DecoratorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 生菜:装饰者的第一层
 */

public class Lettuce extends Condiment {
    Humburger humburger;

    public Lettuce(Humburger humburger){
        this.humburger=humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+"加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }
}
