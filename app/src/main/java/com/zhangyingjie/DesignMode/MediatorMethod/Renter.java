package com.zhangyingjie.DesignMode.MediatorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 租房者
 */

public class Renter extends Person{
    public Renter(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    protected void sendMessage(String msg) {
        mediator.operation(this,msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("租房人[" + name + "]收到中介发来的消息： " + msg);
    }
}
