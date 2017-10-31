package com.zhangyingjie.DesignMode.StateMethod;

/**
 * Created by Administrator on 2017-10-11.
 */

public class Room {
    /**
     * 房间的三个状态
     */
    State freeTimeState;    //空闲状态
    State checkInState;     //入住状态
    State bookedState;      //预定状态

    State state;

    public Room(){
        freeTimeState=new FreeTimeState(this);
        checkInState=new CheckInState(this);
        bookedState=new BookedState(this);

        state=freeTimeState;//初始状态为空闲
    }

    /**
     * 预定房间
     */
    public void boookRoom(){
        state.bookRoom();
    }

    /**
     * 退订房间
     */
    public void unsubscribeRoom(){
        state.unsubscribeRoom();
    }

    /**
     * 入住
     */
    public void checkInRoom(){
        state.checkInRoom();
    }

    /**
     * 退房
     */
    public void checkOutRoom(){
        state.checkOutRoom();
    }

    public String toString(){
        return "该房间的状态是："+getState().getClass().getName();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }
}
