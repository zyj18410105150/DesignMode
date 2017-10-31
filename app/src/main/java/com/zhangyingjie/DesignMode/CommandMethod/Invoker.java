package com.zhangyingjie.DesignMode.CommandMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 调用者（司令）
 */

public class Invoker {
    private Command command;//命令

    public Invoker(Command command){
        this.command=command;
    }
    //动作
    public void action(){
        command.exe();
    }
}
