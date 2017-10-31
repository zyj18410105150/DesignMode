package com.zhangyingjie.DesignMode.ObserverMehtod;

import java.util.*;

/**
 * Created by Administrator on 2017-10-9.
 * 观察者Student
 */

public class Student implements java.util.Observer{
    private Observable ob;
    private String name;

    public Student(String name,Observable ob){
        this.ob=ob;
        this.name=name;
        ob.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        Teacher t= (Teacher) observable;
        System.out.println(name+"得到作业信息:"+t.getInfo());
    }
}
