package com.zhangyingjie.DesignMode.ChainOfResponsibilityMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 责任链模式（Chain of Responsibility）
 */
public class ChainOfResponsibilityActivity extends AppCompatActivity {

    /**
     * 责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。
     * 请求在这个链上传递，直到链上的某一个对象决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，
     * 这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。

     在以下条件下可考虑使用Chain of Responsibility：
     1 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
     2 你想在不明确指定接受者的情况下，想过个对象中的一个提交一个请求。
     3 可处理一个请求的对象集合应该被动态指定。
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility);

        ProjectHandler projectHandler=new ProjectHandler();
        DeptHandler deptHandler=new DeptHandler();
        GeneralHandler generalHandler=new GeneralHandler();

        projectHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(generalHandler);

        projectHandler.doHandler("lwx",450);
        projectHandler.doHandler("lwx", 600);
        projectHandler.doHandler("zy", 600);
        projectHandler.doHandler("zy", 1500);
        projectHandler.doHandler("lwxzy", 1500);
    }
}
