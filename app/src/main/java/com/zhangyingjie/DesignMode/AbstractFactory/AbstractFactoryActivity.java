package com.zhangyingjie.DesignMode.AbstractFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.zhangyingjie.DesignMode.FactoryMethod.Sender;
import com.zhangyingjie.DesignMode.R;

/**
 * 抽象工厂
 */
public class AbstractFactoryActivity extends AppCompatActivity {
    /**
     * 抽象工厂模式的好处就是，如果你现在想增加一个功能：
     * 发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，
     * 无需去改动现成的代码。这样做，拓展性较好！
     * @param savedInstanceState
     */
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        //抽象工厂模式
        Provider provider=new SendMailFactory();
        Sender sender3=provider.produce();
        str=sender3.Send();
        Toast.makeText(AbstractFactoryActivity.this,str, Toast.LENGTH_SHORT).show();
    }
}
