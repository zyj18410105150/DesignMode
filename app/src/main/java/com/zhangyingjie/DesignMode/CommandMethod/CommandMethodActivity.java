package com.zhangyingjie.DesignMode.CommandMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 命令模式（Command）
 */
public class CommandMethodActivity extends AppCompatActivity {
    /**
     * 司令员下令让士兵去干件事情，从整个事情的角度来考虑，司令员的作用是，发出口令，口令经过传递，
     * 传到了士兵耳朵里，士兵去执行。这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，
     * 只需要做好自己的事儿就行，司令员要的是结果，不会去关注到底士兵是怎么实现的。
     * @param savedInstanceState
     */
//      Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，
//      实现了Command接口，持有接收对象，
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_method);

        Receiver receiver=new Receiver();
        Command cmd=new MyCommand(receiver);

        Invoker invoker=new Invoker(cmd);
        invoker.action();
    }
}
