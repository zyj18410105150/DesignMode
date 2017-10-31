package com.zhangyingjie.DesignMode.AbstractFactory;

import com.zhangyingjie.DesignMode.FactoryMethod.Sender;

/**
 * Created by Administrator on 2017-8-23.
 */
public interface Provider {
    Sender produce();
}
