package com.zhangyingjie.DesignMode.DecoratorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 配料的基类:装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料
 */

public abstract class Condiment extends Humburger {
    public abstract String getName();
}
