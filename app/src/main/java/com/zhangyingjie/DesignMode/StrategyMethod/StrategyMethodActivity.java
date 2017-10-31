package com.zhangyingjie.DesignMode.StrategyMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 策略模式（strategy）
 */
public class StrategyMethodActivity extends AppCompatActivity {

    /**
     * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
     * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
     * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
     * 应用
     * 场景如下，刘备要到江东娶老婆了，走之前诸葛亮给赵云三个锦囊妙计，说是按天机拆开能解决棘手问题。场景中出现三个要素：三个妙计（具体策略类）、一个锦囊（环境类）、赵云（调用者）。
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_method);

        Context context;

        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context=new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }
}
