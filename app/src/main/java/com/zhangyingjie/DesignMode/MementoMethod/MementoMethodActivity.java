package com.zhangyingjie.DesignMode.MementoMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 备忘录模式（Memento）
 */
public class MementoMethodActivity extends AppCompatActivity {
    /**
     * 备忘录模式，即保存某个对象内部状态的拷贝，这样以后就可以将该对象恢复到原先的状态。

     三、模式结构

     发起者角色(Originator)：负责创建一个备忘录用以记录当前时刻它的内部状态，并可以使用备忘录恢复内部状态。
     备忘录角色(Memento):负责存储Originator对象的内部状态，并可以防止Originator以外的其他对象访问备忘录。
     管理者角色(CareTake)：负责保存好备忘录。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento_method);

        CareTaker careTaker=new CareTaker();

        Emp emp=new Emp("张飞",12,"男");
        System.out.print(emp.getName()+emp.getAge()+emp.getSex());

        careTaker.setEmpMemento(emp.memento());//进行备忘

        emp.setAge(20);
        emp.setSex("女");
        System.out.print(emp.getName()+emp.getAge()+emp.getSex());

        emp.recovery(careTaker.getEmpMemento());//数据恢复
        System.out.print(emp.getName()+emp.getAge()+emp.getSex());
    }
}
