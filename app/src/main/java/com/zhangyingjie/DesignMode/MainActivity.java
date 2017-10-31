package com.zhangyingjie.DesignMode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zhangyingjie.DesignMode.AbstractFactory.AbstractFactoryActivity;
import com.zhangyingjie.DesignMode.AdapterMethod.AdapterMethodActivity;
import com.zhangyingjie.DesignMode.BridgeMethod.BridgeMethodActivity;
import com.zhangyingjie.DesignMode.BuilderMethod.BuilderMethodActivity;
import com.zhangyingjie.DesignMode.ChainOfResponsibilityMethod.ChainOfResponsibilityActivity;
import com.zhangyingjie.DesignMode.CommandMethod.CommandMethodActivity;
import com.zhangyingjie.DesignMode.CompositeMethod.CompositeMethodActivity;
import com.zhangyingjie.DesignMode.DecoratorMethod.DecoratorMethodActivity;
import com.zhangyingjie.DesignMode.FacadeMethod.FacadeMethodActivity;
import com.zhangyingjie.DesignMode.FactoryMethod.FactoryMethodActivity;
import com.zhangyingjie.DesignMode.FlyweightMethod.FlyweightMethodActivity;
import com.zhangyingjie.DesignMode.InterpreterMethod.InterpreterMethodActivityActivity;
import com.zhangyingjie.DesignMode.IteratorMethod.IteratorMethodActivity;
import com.zhangyingjie.DesignMode.MediatorMethod.MediatorMethodActivity;
import com.zhangyingjie.DesignMode.MementoMethod.MementoMethodActivity;
import com.zhangyingjie.DesignMode.ObserverMehtod.ObserverMethodActivity;
import com.zhangyingjie.DesignMode.PrototypeMethod.PrototypeMethodActivity;
import com.zhangyingjie.DesignMode.ProxyMethod.ProxyActivity;
import com.zhangyingjie.DesignMode.SingletonMethod.SingletonMethodActivity;
import com.zhangyingjie.DesignMode.StateMethod.StateMethodActivity;
import com.zhangyingjie.DesignMode.StrategyMethod.StrategyMethodActivity;
import com.zhangyingjie.DesignMode.TemplateMethod.TemplateMethodActivity;
import com.zhangyingjie.DesignMode.VisitorMethod.VisitorMethodActivity;

public class MainActivity extends Activity {

    /**
     * 二、设计模式的六大原则

     1、开闭原则（Open Close Principle）

     开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

     2、里氏代换原则（Liskov Substitution Principle）

     里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

     3、依赖倒转原则（Dependence Inversion Principle）

     这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。

     4、接口隔离原则（Interface Segregation Principle）

     这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。

     5、迪米特法则（最少知道原则）（Demeter Principle）

     为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

     6、合成复用原则（Composite Reuse Principle）

     原则是尽量使用合成/聚合的方式，而不是使用继承。
     * @param savedInstanceState
     */

    private String [] design=new String[]{"工厂模式（Factory Method）","单例模式（Singleton）","建造者模式（Builder）","原型模式（Prototype）",
            "适配器模式（Adapter）","抽象工厂模式（Abstract Factory）", "装饰模式（Decorator）","代理模式（Proxy）","外观模式（Facade）",
            "桥接模式（Bridge）","组合模式（Composite）", "享元模式（Flyweight）","策略模式（strategy）","模板方法模式（Template Method）",
            "观察者模式（Observer）", "迭代子模式（Iterator）", "责任链模式（Chain of Responsibility）","命令模式（Command）",
            "备忘录模式（Memento）", "状态模式（State）", "访问者模式（Visitor）", "中介者模式（Mediator）", "解释器模式（Interpreter）"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv_btn= (ListView) findViewById(R.id.lv_btn);
        lv_btn.setAdapter(new MainAdapter(design,MainActivity.this));

        lv_btn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0://工厂模式
                        startActivity(new Intent(MainActivity.this,FactoryMethodActivity.class));
                        break;
                    case 1://单例模式
                        startActivity(new Intent(MainActivity.this, SingletonMethodActivity.class));
                        break;
                    case 2://建造者模式
                        startActivity(new Intent(MainActivity.this, BuilderMethodActivity.class));
                        break;
                    case 3://原型模式
                        startActivity(new Intent(MainActivity.this, PrototypeMethodActivity.class));
                        break;
                    case 4://适配器模式
                        startActivity(new Intent(MainActivity.this, AdapterMethodActivity.class));
                        break;
                    case 5://抽象工厂模式
                        startActivity(new Intent(MainActivity.this, AbstractFactoryActivity.class));
                        break;
                    case 6://装饰模式（Decorator）
                        startActivity(new Intent(MainActivity.this, DecoratorMethodActivity.class));
                        break;
                    case 7://代理模式（Proxy）
                        startActivity(new Intent(MainActivity.this, ProxyActivity.class));
                        break;
                    case 8://外观模式（Facade）
                        startActivity(new Intent(MainActivity.this, FacadeMethodActivity.class));
                        break;
                    case 9://桥接模式（Bridge）
                        startActivity(new Intent(MainActivity.this,BridgeMethodActivity.class));
                        break;
                    case 10://组合模式（Composite）
                        startActivity(new Intent(MainActivity.this, CompositeMethodActivity.class));
                        break;
                    case 11://享元模式（Flyweight）
                        startActivity(new Intent(MainActivity.this, FlyweightMethodActivity.class));
                        break;
                    case 12://策略模式（strategy）
                        startActivity(new Intent(MainActivity.this, StrategyMethodActivity.class));
                        break;
                    case 13://模板方法模式（Template Method）
                        startActivity(new Intent(MainActivity.this, TemplateMethodActivity.class));
                        break;
                    case 14://观察者模式（Observer）
                        startActivity(new Intent(MainActivity.this, ObserverMethodActivity.class));
                        break;
                    case 15://迭代子模式（Iterator）
                        startActivity(new Intent(MainActivity.this, IteratorMethodActivity.class));
                        break;
                    case 16://责任链模式（Chain of Responsibility）
                        startActivity(new Intent(MainActivity.this, ChainOfResponsibilityActivity.class));
                        break;
                    case 17://命令模式（Command）
                        startActivity(new Intent(MainActivity.this, CommandMethodActivity.class));
                        break;
                    case 18://"备忘录模式（Memento）
                        startActivity(new Intent(MainActivity.this, MementoMethodActivity.class));
                        break;
                    case 19://状态模式（State）
                        startActivity(new Intent(MainActivity.this, StateMethodActivity.class));
                        break;
                    case 20://访问者模式（Visitor）
                        startActivity(new Intent(MainActivity.this, VisitorMethodActivity.class));
                        break;
                    case 21://中介者模式（Mediator）
                        startActivity(new Intent(MainActivity.this, MediatorMethodActivity.class));
                        break;
                    case 22://解释器模式（Interpreter）
                        startActivity(new Intent(MainActivity.this, InterpreterMethodActivityActivity.class));
                        break;

                }
            }
        });
    }
}
