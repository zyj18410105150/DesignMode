package com.zhangyingjie.DesignMode.BridgeMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.print("具体实现B");
    }
}
