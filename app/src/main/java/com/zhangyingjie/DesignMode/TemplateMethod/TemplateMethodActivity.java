package com.zhangyingjie.DesignMode.TemplateMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 模板方法模式（Template Method）
 */
public class TemplateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);

        AbstractPerson student=new Student();
        student.prepareGotoSchool();

        AbstractPerson teacher=new Teacher();
        teacher.prepareGotoSchool();
    }
}
