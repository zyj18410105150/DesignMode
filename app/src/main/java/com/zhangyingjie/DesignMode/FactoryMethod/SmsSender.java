package com.zhangyingjie.DesignMode.FactoryMethod;

/**
 * Created by Administrator on 2017-8-23.
 */
public class SmsSender implements Sender {
    @Override
    public String Send() {
        return "smsSender";
    }
}
