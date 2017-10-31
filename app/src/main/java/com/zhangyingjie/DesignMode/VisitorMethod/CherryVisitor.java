package com.zhangyingjie.DesignMode.VisitorMethod;

/**
 * Created by Administrator on 2017-10-12.
 */

public class CherryVisitor implements ShoppingCartVisitor {
    @Override
    public double visitor(GoodsItem goodsItem) {
        Cherry cherry= (Cherry) goodsItem;
        double cost=cherry.getPrice()*cherry.getWeight();
        System.out.println(String.format("Cherry 单价：%s 重量：%s 总价：%s",cherry.getPrice(),cherry.getWeight(),cost));
        //进口樱桃 8折
        cost*=0.8;
        System.out.println(String.format("Cherry 今日8折，折后总价%s",cost));
        return cost;
    }
}
