package com.zhangyingjie.DesignMode.AbstractFactory;

import com.zhangyingjie.DesignMode.AbstractFactory.Provider;
import com.zhangyingjie.DesignMode.FactoryMethod.Sender;
import com.zhangyingjie.DesignMode.FactoryMethod.SmsSender;

/**
 * Created by Administrator on 2017-8-23.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
