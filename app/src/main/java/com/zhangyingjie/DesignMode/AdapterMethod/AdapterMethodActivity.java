package com.zhangyingjie.DesignMode.AdapterMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 适配器模式
 */
public class AdapterMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_method);
        /**
         * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
         * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
         */
    }
}
