package com.zhangyingjie.DesignMode.ObserverMehtod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;
import com.zhangyingjie.DesignMode.TemplateMethod.Student;

/**
 * 观察者模式（Observer）
 */
public class ObserverMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_method);

        TeacherSubject teacherSubject=new TeacherSubject();
        StudentObserver zhangsan=new StudentObserver("张三",teacherSubject);
        StudentObserver lisi=new StudentObserver("李四",teacherSubject);
        StudentObserver wangwu=new StudentObserver("王五",teacherSubject);

        teacherSubject.setHomework("第二页第六题");
        teacherSubject.setHomework("第三页第七题");

//        java内置的观察者模式:
        Teacher teacher=new Teacher();
        com.zhangyingjie.DesignMode.ObserverMehtod.Student zhaoliu=new com.zhangyingjie.DesignMode.ObserverMehtod.Student("赵六",teacher);
        com.zhangyingjie.DesignMode.ObserverMehtod.Student sunqi=new com.zhangyingjie.DesignMode.ObserverMehtod.Student("孙七",teacher);

        teacher.setHomework("第四页第八题");
        teacher.setHomework("第五页第九题");
    }
}
