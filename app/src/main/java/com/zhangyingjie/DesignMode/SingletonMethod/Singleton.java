package com.zhangyingjie.DesignMode.SingletonMethod;

/**
 * Created by Administrator on 2017-8-23.
 * 懒汉式，线程不安全
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 */
public class Singleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，
     * 目的是实现延迟加载
     */
    private static Singleton instance=null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton(){}

    /**
     * 静态工程方法，创建实例
     */
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
