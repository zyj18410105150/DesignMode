package com.zhangyingjie.DesignMode.IteratorMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public interface Iterator {
    /**
     * 迭代方法：移动到第一个元素
     */
    public void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    public void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    public Boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    public Object currentItem();
}
