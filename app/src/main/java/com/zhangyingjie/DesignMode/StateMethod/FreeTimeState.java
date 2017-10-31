package com.zhangyingjie.DesignMode.StateMethod;

/**
 * Created by Administrator on 2017-10-11.
 */

public class FreeTimeState implements State {
    Room hotelManagement;

    public FreeTimeState(Room hotelManagement){
        this.hotelManagement=hotelManagement;
    }
    @Override
    public void bookRoom() {
        System.out.print("您已经成功预定了");
        //状态变为已预定
        hotelManagement.setState(hotelManagement.getBookedState());
    }

    @Override
    public void unsubscribeRoom() {
        //不需要做操作
    }

    @Override
    public void checkInRoom() {
        System.out.print("您已经成功入住了");
        //状态变为已入住
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        //不需要做操作
    }
}
