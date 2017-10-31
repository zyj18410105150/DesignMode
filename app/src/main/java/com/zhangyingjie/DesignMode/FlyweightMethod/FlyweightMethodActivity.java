package com.zhangyingjie.DesignMode.FlyweightMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 享元模式（Flyweight）
 */
public class FlyweightMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight_method);

        String exercise="篮球";
        for (int i=0;i<5; i++){
            Gymnasium gymnasium=ArchitectureFactory.getGymnasium(exercise);
            gymnasium.setName("北京体育馆");
            gymnasium.setShape("圆形");
            gymnasium.use();
            System.out.print("对象池中对象数量为："+ArchitectureFactory.getSize());
        }
    }
}
