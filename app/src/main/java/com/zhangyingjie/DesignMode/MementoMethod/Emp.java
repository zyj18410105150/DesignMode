package com.zhangyingjie.DesignMode.MementoMethod;

/**
 * Created by Administrator on 2017-10-11.
 * 发起者角色:
 */

public class Emp {
    private String name;
    private int age;
    private String sex;

    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento empMemento){
        this.name=empMemento.getName();
        this.age=empMemento.getAge();
        this.sex=empMemento.getSex();
    }

    public Emp(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
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
