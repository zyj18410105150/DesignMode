package com.zhangyingjie.DesignMode.CompositeMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 组合模式（Composite）
 */
public class CompositeMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite_method);

        MarketBranch marketBranch=new MarketBranch("总店");
        MarketBranch marketBranch1=new MarketBranch("分店");
        MarketJoin marketJoin=new MarketJoin("分店加盟店");
        MarketJoin marketJoin1=new MarketJoin("分店加盟店2");

        marketBranch1.add(marketJoin);
        marketBranch1.add(marketJoin1);
        marketBranch.add(marketBranch1);
        marketBranch.PayByCard();
    }
}
