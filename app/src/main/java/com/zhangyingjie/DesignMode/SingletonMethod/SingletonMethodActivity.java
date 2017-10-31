package com.zhangyingjie.DesignMode.SingletonMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 单例模式
 * 单例对象（Singleton）是一种常用的设计模式。单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处：
 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
 （比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 */
public class SingletonMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_method);
        /**
         * 总结：
         * 1、单例模式理解起来简单，但是具体实现起来还是有一定的难度。
         * 2、synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用（注意需要使用锁的对象和过程，可能有的时候并不是整个对象及整个过程都需要锁）。

         * 采用类的静态方法，实现单例模式的效果，也是可行的，此处二者有什么不同？
         首先，静态类不能实现接口（从类的角度说是可以的，但是那样就破坏了静态了。因为接口中不允许有static修饰的方法，所以即使实现了也是非静态的）
         其次，单例可以被延迟初始化，静态类一般在第一次加载是初始化。之所以延迟加载，是因为有些类比较庞大，所以延迟加载有助于提升性能。
         再次，单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。

         最后一点，单例类比较灵活，毕竟从实现上只是一个普通的Java类，只要满足单例的基本需求，你可以在里面随心所欲的实现一些其它功能，
         但是静态类不行。从上面这些概括中，基本可以看出二者的区别，
         但是，从另一方面讲，我们上面最后实现的那个单例模式，内部就是用一个静态类来实现的，
         所以，二者有很大的关联，只是我们考虑问题的层面不同罢了。
         两种思想的结合，才能造就出完美的解决方案，就像HashMap采用数组+链表来实现一样，其实生活中很多事情都是这样，
         单用不同的方法来处理问题，总是有优点也有缺点，
         最完美的方法是，结合各个方法的优点，才能最好的解决问题！
         */
    }
}
