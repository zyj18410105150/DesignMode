package com.zhangyingjie.DesignMode.FactoryMethod;

import android.widget.Toast;

/**
 * Created by Administrator on 2017-8-23.
 */
public class MailSender implements Sender {
    @Override
    public String Send() {
        return "mailSender";
    }
}
