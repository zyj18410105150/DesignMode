package com.zhangyingjie.DesignMode.DecoratorMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

public class DecoratorMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator_method);

        Humburger humburger=new ChickenBurger();
        System.out.println(humburger.getName()+"  价钱："+humburger.getPrice());
        Lettuce lettuce=new Lettuce(humburger);
        System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice());
        Chilli chilli=new Chilli(humburger);
        System.out.println(chilli.getName()+"  价钱："+chilli.getPrice());
        Chilli chilli1=new Chilli(lettuce);
        System.out.println(chilli1.getName()+"  价钱："+chilli1.getPrice());
    }
}
