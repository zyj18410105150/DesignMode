package com.zhangyingjie.DesignMode.BuilderMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.zhangyingjie.DesignMode.R;

/**
 * 建造者模式
 */
public class BuilderMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_method);

        Student student=new Student.StudentBuilder(1,"小王")
                .setAge(1)
                .setAddress("昌平区霍营")
                .setGender(2)
                .build();

        Toast.makeText(BuilderMethodActivity.this, student.getAddress(), Toast.LENGTH_SHORT).show();
    }
}
