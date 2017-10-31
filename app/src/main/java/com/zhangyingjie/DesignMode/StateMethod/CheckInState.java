package com.zhangyingjie.DesignMode.StateMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 入住可以退房
 */

public class CheckInState implements State {
    Room hotelManagement;

    public CheckInState(Room hotelManagement){
        this.hotelManagement=hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功...");
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
}
