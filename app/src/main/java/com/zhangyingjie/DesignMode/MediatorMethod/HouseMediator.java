package com.zhangyingjie.DesignMode.MediatorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 具体中介者类：这里的角色是 房屋出租中介
 */

public class HouseMediator extends Mediator {
    @Override
    public void operation(Person person, String message) {
        if (person instanceof Renter){
            //将租屋的需求消息传递给 注册了的房东们
            for (Person landlord:landlordList){
                landlord.getMessage(message);
            }
        }else if (person instanceof Landlord){
            for (Person renter : renterList){
                renter.getMessage(message);
            }
        }
    }
}
