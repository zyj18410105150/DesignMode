package com.zhangyingjie.DesignMode.IteratorMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.zhangyingjie.DesignMode.R;

/**
 * 迭代子模式（Iterator）
 */
public class IteratorMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator_method);

        Object [] objArray={"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg=new ConcreateAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it=agg.createIterator();
        while (!it.isDone()){
            Toast.makeText(this, it.currentItem()+"", Toast.LENGTH_SHORT).show();
            it.next();
        }
    }
}
