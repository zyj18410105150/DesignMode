package com.zhangyingjie.DesignMode.IteratorMethod;

/**
 * Created by Administrator on 2017-10-9.
 */

public class ConcreateAggregate extends Aggregate {
    private Object[] objArray=null;

    /**
     * 构造方法，传入聚合对象的具体内容
     * @return
     */
    public ConcreateAggregate(Object[] objArray){
        this.objArray=objArray;
    }


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){
        if (index<objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objArray.length;
    }
}
