package com.zhangyingjie.DesignMode.ChainOfResponsibilityMethod;

/**
 * Created by Administrator on 2017-10-9.
 * 项目经理
 */

public class ProjectHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free < 500){
            if (user.equals("lwx")){
                System.out.print("给予报销："+free);
            }else{
                System.out.print("报销不通过");
            }
        }else{
            if (getNextHandler()!=null){
                getNextHandler().doHandler(user,free);
            }
        }
    }
}
