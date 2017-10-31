package com.zhangyingjie.DesignMode.MementoMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 备忘录角色:普通javabean
 */

public class EmpMemento {
    private String name;
    private int age;
    private String sex;

    public EmpMemento(Emp emp){
        this.name=emp.getName();
        this.age=emp.getAge();
        this.sex=emp.getSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
