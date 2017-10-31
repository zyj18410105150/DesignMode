package com.zhangyingjie.DesignMode.TemplateMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public abstract class AbstractPerson {
    //抽象类定义整体流程骨架
    public void prepareGotoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
    }

    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract void dressUp();
    protected abstract void eatBreakfast();
    protected abstract void takeThings();
}
