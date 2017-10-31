package com.zhangyingjie.DesignMode.CommandMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 命令类实现了Command接口
 */

public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
