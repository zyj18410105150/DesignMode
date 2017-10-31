package com.zhangyingjie.DesignMode.MementoMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 管理者角色：负责管理备忘录类，示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 */

public class CareTaker {
    private EmpMemento empMemento;

    public EmpMemento getEmpMemento(){
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento){
        this.empMemento=empMemento;
    }
}
