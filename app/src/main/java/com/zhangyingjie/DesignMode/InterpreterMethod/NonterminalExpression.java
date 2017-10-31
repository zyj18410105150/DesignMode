package com.zhangyingjie.DesignMode.InterpreterMethod;

/**
 * Created by Administrator on 2017-10-12.
 */

public class NonterminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        context.setOutput("非终端"+context.getInput());
        System.out.println(context.getInput() + "经过非终端解释器解释为：" + context.getOutput());
    }
}
