package com.zhangyingjie.DesignMode.ProxyMethod;

import android.util.Log;

/**
 * Created by Administrator on 2017-10-9.
 */

public class Customer implements IBuyCar {
    private int cash;//购车款

    public int getCash(){
        return cash;
    }

    public void setCash(int cash){
        this.cash = cash;
    }

    @Override
    public void buyCar() {
        Log.e("buyCar","买一辆车花费了--》"+cash+"元");
    }
}
