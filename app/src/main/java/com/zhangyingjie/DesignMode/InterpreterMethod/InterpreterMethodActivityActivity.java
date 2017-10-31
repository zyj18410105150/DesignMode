package com.zhangyingjie.DesignMode.InterpreterMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 解释器模式（Interpreter）
 */
public class InterpreterMethodActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter_method_activity);

        Context context=new Context();
        context.setInput("AAA");

        AbstractExpression expression=new TerminalExpression();
        expression.Interpret(context);

        AbstractExpression expression1=new NonterminalExpression();
        expression1.Interpret(context);
    }
}
