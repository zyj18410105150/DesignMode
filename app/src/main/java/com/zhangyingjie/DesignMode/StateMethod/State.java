package com.zhangyingjie.DesignMode.StateMethod;

/**
 * Created by Administrator on 2017-10-11.
 */

public interface State {
    /**
     * 预订房间
     */
    public void bookRoom();

    /**
     * 退订房间
     */
    public void unsubscribeRoom();

    /**
     * 入住
     */
    public void checkInRoom();

    /**
     * 退房
     */
    public void checkOutRoom();
}
