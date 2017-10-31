package com.zhangyingjie.DesignMode.ObserverMehtod;

import com.zhangyingjie.DesignMode.TemplateMethod.Student;
import com.zhangyingjie.DesignMode.TemplateMethod.Teacher;

/**
 * Created by Administrator on 2017-10-9.
 */

public class StudentObserver implements Observer {
    //保存一个Subject的引用,以后如果可以想取消订阅,有了这个引用会比较方便
    private TeacherSubject t;
    //学生的姓名,用来标识不同的学生对象
    private String name;
    //构造器用来注册观察者
    public StudentObserver(String name, TeacherSubject t){
        this.name=name;
        this.t=t;
        t.addObserver(this);
    }

    @Override
    public void update(String info) {
        System.out.print(name+"得到作业："+info);
    }
}
