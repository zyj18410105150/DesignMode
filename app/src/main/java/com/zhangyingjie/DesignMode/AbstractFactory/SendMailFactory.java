package com.zhangyingjie.DesignMode.AbstractFactory;

import com.zhangyingjie.DesignMode.AbstractFactory.Provider;
import com.zhangyingjie.DesignMode.FactoryMethod.MailSender;
import com.zhangyingjie.DesignMode.FactoryMethod.Sender;

/**
 * Created by Administrator on 2017-8-23.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
