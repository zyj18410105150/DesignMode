package com.zhangyingjie.DesignMode.BridgeMethod;

/**
 * Created by Administrator on 2017-10-9.
 * 定义抽象接口
 */

public abstract class Abstraction {
    //持有一个Implementor对象，形成聚合关系
    protected Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor=implementor;
    }

    //可能需要转调实现部分的具体实现
    public void operation(){
        implementor.operationImpl();
    }
}
