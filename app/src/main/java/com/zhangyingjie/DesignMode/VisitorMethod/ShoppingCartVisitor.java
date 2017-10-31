package com.zhangyingjie.DesignMode.VisitorMethod;

/**
 * Created by Administrator on 2017-10-12.
 * 购物接口
 */

public interface ShoppingCartVisitor {
    public double visitor(GoodsItem goodsItem);
}
