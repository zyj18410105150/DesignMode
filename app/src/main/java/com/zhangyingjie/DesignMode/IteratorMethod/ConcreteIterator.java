package com.zhangyingjie.DesignMode.IteratorMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class ConcreteIterator implements Iterator {
    //持有被迭代的具体的聚合对象
    private ConcreateAggregate agg;
    //内部索引，记录当前迭代到的索引位置
    private int index = 0;
    //记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator(ConcreateAggregate agg){
        this.agg=agg;
        this.size=agg.size();
        index=0;
    }

    /**
     * 迭代方法：移动到第一个元素
     */
    @Override
    public void first() {
        index=0;
    }

    /**
     * 迭代方法：移动到下一个元素
     */
    @Override
    public void next() {
        if (index<size){
            index++;
        }
    }

    /**
     * 迭代方法：是否为最后一个元素
     */
    @Override
    public Boolean isDone() {
        return (index>=size);
    }

    /**
     * 迭代方法：返回当前元素
     * @return
     */
    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
