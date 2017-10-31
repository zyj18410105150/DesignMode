package com.zhangyingjie.DesignMode.FactoryMethod;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.zhangyingjie.DesignMode.R;

/**
 * Created by Administrator on 2017-8-23.
 */
public class FactoryMethodActivity extends Activity {
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        //简单工厂模式
        SendFactory factory=new SendFactory();
        Sender sender=factory.produce("sms");
        str=sender.Send();
        //多个工厂方法模式
        SendFactory2 factory2=new SendFactory2();
        Sender sender1=factory2.produceSms();
        str=sender1.Send();
        //静态工厂方法模式
        Sender sender2=SendFactory3.produceMail();
        str=sender2.Send();


        Toast.makeText(FactoryMethodActivity.this,str, Toast.LENGTH_SHORT).show();
        /**
         * 总结:工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
         * 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
         * 第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
         */

    }
}
