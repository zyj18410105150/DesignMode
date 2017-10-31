package com.zhangyingjie.DesignMode.MediatorMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 中介者模式（Mediator）
 */
public class MediatorMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator_method);

        //实例化房屋中介
        Mediator mediator=new HouseMediator();

        Person landlordA,landlordB,renter;
        landlordA=new Landlord("房东张三",mediator);
        landlordB=new Landlord("房东李四",mediator);

        renter=new Renter("租房者王五",mediator);

        //房东注册中介
        mediator.registerLandlord(landlordA);
        mediator.registerLandlord(landlordB);
        //租房者注册中介
        mediator.registerLandlord(renter);

        //租房者发送求租消息
        renter.sendMessage("想在天通苑租套房子");
        System.out.println("--------------------------------------");
        //房东张三发送房屋出租消息
        landlordA.sendMessage("霍营有一室一厅出租");
    }
}
