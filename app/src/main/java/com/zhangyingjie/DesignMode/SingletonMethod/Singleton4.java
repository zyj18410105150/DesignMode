package com.zhangyingjie.DesignMode.SingletonMethod;

/**
 * Created by Administrator on 2017-8-23.
 * 饿汉，变种
 * 基于静态 代码块，在实例化或者第一次调用时执行
 * 既可以延迟加载，又线程安全
 */
public class Singleton4 {
    private static Singleton4 instance=null;
    static {
        instance=new Singleton4();
    }
    
    private Singleton4(){}
    
    public static Singleton4 getInstance(){
        return instance;
    }
}
