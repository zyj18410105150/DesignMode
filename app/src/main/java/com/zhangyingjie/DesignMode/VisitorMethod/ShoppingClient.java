package com.zhangyingjie.DesignMode.VisitorMethod;

import java.util.List;

/**
 * Created by Administrator on 2017-10-12.
 */

public class ShoppingClient {
    private List<GoodsItem> list;

    public ShoppingClient(List<GoodsItem> list){
        this.list=list;
    }

    public List<GoodsItem> getList(){
        return list;
    }
    public void setList(List<GoodsItem> list){
        this.list=list;
    }

    public double perchase(){
        double costTotal=0.0;
        for (GoodsItem goodsItem : list){
            costTotal+=goodsItem.accept(goodsItem.getSelfVisitor());
        }
        return costTotal;
    }
}
