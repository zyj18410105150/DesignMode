package com.zhangyingjie.DesignMode.ChainOfResponsibilityMethod;

/**
 * Created by Administrator on 2017-10-9.
 * 总经理
 */

public class GeneralHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free>=1000){
            if (user.equals("lwxzy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }
        }else{
            if (getNextHandler()!=null){
                getNextHandler().doHandler(user,free);
            }
        }
    }
}
