package com.zhangyingjie.DesignMode.StateMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 状态模式（State）
 */
public class StateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_method);
        //有2间房
        Room[] rooms=new Room[2];
        //初始化
        for (int i=0;i<rooms.length;i++){
            rooms[i]=new Room();
        }
        //第一间房
        rooms[0].boookRoom();//预定
        rooms[0].checkInRoom();//入住
        rooms[0].boookRoom();//预定
        System.out.print(rooms[0]);
        System.out.print("**********************************");
        //第二间房
        rooms[1].checkInRoom();
        rooms[1].boookRoom();
        rooms[1].checkOutRoom();
        rooms[1].boookRoom();
        System.out.print(rooms[1]);
    }
}
