package com.zhangyingjie.DesignMode.ProxyMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

import java.lang.reflect.InvocationHandler;
import java.net.Proxy;

/**
 * 代理模式（Proxy）
 */
public class ProxyActivity extends AppCompatActivity {
//    什么是代理模式？
//
//   代理模式的定义：代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。
// 举例说明，就是一个人或者一个机构代表另一个人或者另一个机构采取行动。
// 在一些情况下，一个客户不想或者不能够直接引用一个对象，而代理对象可以在客户端和目标对象之前起到中介的作用。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        //静态代理模式
        Customer customer=new Customer();
        customer.setCash(120000);
        BuyCarProxy buyCarProxy=new BuyCarProxy(customer);
        buyCarProxy.buyCar();
        //动态代理模式
        Customer customer1=new Customer();//我们要代理的真实对象
        InvocationHandler handler=new DynamicProxy(customer1);//我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的

        IBuyCar buyCar= (IBuyCar) java.lang.reflect.Proxy.newProxyInstance(handler.getClass().getClassLoader(),customer1.getClass().getInterfaces(),handler);
        buyCar.buyCar();

//        动态代理好处
//
//        使用Java动态代理机制的好处：
//
//        1、减少编程的工作量：假如需要实现多种代理处理逻辑，只要写多个代理处理器就可以了，无需每种方式都写一个代理类。
//
//        2、系统扩展性和维护性增强，程序修改起来也方便多了(一般只要改代理处理器类就行了)。
    }
}
