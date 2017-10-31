package com.zhangyingjie.DesignMode.CompositeMethod;

/**
 * Created by Administrator on 2017-10-12.
 */

public abstract class Market {
    String name;

    public abstract void add(Market m);

    public abstract void remove(Market m);

    public abstract void PayByCard();
}
