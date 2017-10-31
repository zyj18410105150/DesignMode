package com.zhangyingjie.DesignMode.MediatorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 抽象同事类
 */

public abstract class Person {
    //维持一个抽象中介者的引用
    protected Mediator mediator;
    protected String name;

    public Person(String name,Mediator mediator){
        this.name=name;
        this.mediator=mediator;
    }

    /**
     * 设置中介者对象
     */
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    /**
     * 向中介发送消息
     */
    protected abstract void sendMessage(String msg);

    /**
     * 从中介获取消息
     */
    protected abstract void getMessage(String msg);
}
