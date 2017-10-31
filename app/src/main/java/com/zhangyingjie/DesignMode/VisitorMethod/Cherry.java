package com.zhangyingjie.DesignMode.VisitorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 商品类，实现goodsItem接口
 */

public class Cherry implements GoodsItem {
    private double price;
    private int weight;

    public Cherry(double price,int weight){
        this.price=price;
        this.weight=weight;
    }

    public double getPrice(){
        return price;
    }

    public int getWeight(){
        return weight;
    }
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visitor(this);
    }

    @Override
    public ShoppingCartVisitor getSelfVisitor() {
        return new CherryVisitor();
    }
}
