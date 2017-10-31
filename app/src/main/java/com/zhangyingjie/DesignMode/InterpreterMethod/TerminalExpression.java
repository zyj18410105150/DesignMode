package com.zhangyingjie.DesignMode.InterpreterMethod;

/**
 * Created by Administrator on 2017-10-12.
 */

public class TerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        context.setOutput("终端"+context.getInput());
        System.out.println(context.getInput() + "经过终端解释器解释为：" + context.getOutput());
    }
}
