package com.zhangyingjie.DesignMode.SingletonMethod;

/**
 * Created by Administrator on 2017-8-23.
 * （双重校验锁）：
 * 懒汉模式的优化版，拥有线程安全、高效率以及延迟加载等特性。
 * 但是这种方式需要jdk1.5以上，且在一些平台和编译器下有错。
 */
public class Singleton7 {
    private volatile static Singleton7 singleton;

    private Singleton7(){}

    public static Singleton7 getSingleton(){
        if (singleton==null){
            synchronized (Singleton7.class){
                if (singleton==null){
                    singleton=new Singleton7();
                }
            }
        }
        return singleton;
    }
}
