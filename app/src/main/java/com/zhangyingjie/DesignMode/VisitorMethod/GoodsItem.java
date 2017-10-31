package com.zhangyingjie.DesignMode.VisitorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 商品项接口：两个方法等实现
 */

public interface GoodsItem {
    public double accept(ShoppingCartVisitor visitor);

    public ShoppingCartVisitor getSelfVisitor();
}
