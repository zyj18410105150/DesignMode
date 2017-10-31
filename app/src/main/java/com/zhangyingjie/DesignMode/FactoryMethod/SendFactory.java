package com.zhangyingjie.DesignMode.FactoryMethod;

/**
 * Created by Administrator on 2017-8-23.
 */
public class SendFactory {

    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else{
            return null;
        }
    }
}
