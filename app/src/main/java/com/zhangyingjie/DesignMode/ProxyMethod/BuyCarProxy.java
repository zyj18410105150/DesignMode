package com.zhangyingjie.DesignMode.ProxyMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class BuyCarProxy implements IBuyCar {
    private Customer customer;

    public BuyCarProxy(Customer customer){
        this.customer=customer;
    }

    @Override
    public void buyCar() {
        customer.buyCar();
    }
}
