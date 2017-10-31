package com.zhangyingjie.DesignMode.VisitorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 增加奶粉Visitor
 */

public class MilkVisitor implements ShoppingCartVisitor {
    @Override
    public double visitor(GoodsItem goodsItem) {
        Milk milk= (Milk) goodsItem;
        double cost=milk.getPrice()*milk.getNumber();
        System.out.println(String.format("%s 单盒价：%s，盒数%s 总价：%s",milk.getBrand(),milk.getPrice(),milk.getNumber(),cost));
        //奶粉满300减50
        if (cost>=300){
            cost-=50;
        }
        System.out.println(String.format("%s 今日满300减50，优惠后总价：%s",milk.getBrand(),cost));
        return cost;
    }
}
