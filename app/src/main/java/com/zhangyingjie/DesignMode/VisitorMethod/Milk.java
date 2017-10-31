package com.zhangyingjie.DesignMode.VisitorMethod;

import com.zhangyingjie.DesignMode.StrategyMethod.Strategy;

/**
 * Created by Administrator on 2017-10-12.
 * 商品类，实现goodsItem接口
 */

public class Milk implements GoodsItem {
    private String brand;
    private double price;
    private int number;

    public Milk(String brand,double price,int number){
        this.brand=brand;
        this.price=price;
        this.number=number;
    }

    public int getNumber(){
        return number;
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }


    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visitor(this);
    }

    @Override
    public ShoppingCartVisitor getSelfVisitor() {
        return new MilkVisitor();
    }
}
