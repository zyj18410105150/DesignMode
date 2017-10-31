package com.zhangyingjie.DesignMode.CompositeMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-10-12.
 * 分店 下面可以有加盟店
 */

public class MarketBranch extends Market {
    //加盟店列表
    List<Market> list=new ArrayList<>();

    public MarketBranch(String s){
        this.name=s;
    }

    @Override
    public void add(Market m) {
        list.add(m);
    }

    @Override
    public void remove(Market m) {
        list.remove(m);
    }
    // 消费之后，该分店下的加盟店自动累加积分
    @Override
    public void PayByCard() {
        System.out.print(name+"消费，积分加入会员卡");
        for (Market m : list){
            m.PayByCard();
        }
    }
}
