package com.zhangyingjie.DesignMode.MediatorMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-10-12.
 * 抽象中介者类
 */

public abstract class Mediator {
    //用于添加存储“房东”
    protected List<Person> landlordList=new ArrayList<>();
    //用于添加存储“租房人”
    protected List<Person> renterList=new ArrayList<>();

    /**
     * 中介者注册房东信息
     */
    public void registerLandlord(Person landlord){
        landlordList.add(landlord);
    }

    /**
     * 中介者注册  租房人信息
     */
    public void registerRenter(Person renter){
        renterList.add(renter);
    }

    /**
     * 声明抽象方法，由具体中介者子类实现，消息的中转和协调
     */
    public abstract void operation(Person person,String message);
}
