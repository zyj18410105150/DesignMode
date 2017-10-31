package com.zhangyingjie.DesignMode.VisitorMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式（Visitor）
 */
public class VisitorMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor_method);

        List<GoodsItem> list=new ArrayList<>();
        list.add(new Milk("牛奶",160.0,2));
        list.add(new Cherry(80.0,5));

        ShoppingClient shoppingClient=new ShoppingClient(list);
        double totalcost=shoppingClient.perchase();
        System.out.print(String.format("购物总价%s",totalcost));
    }
}
