package com.zhangyingjie.DesignMode.FlyweightMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-10-9.
 */

public class ArchitectureFactory {
    private static final Map<String,Gymnasium> gymnasium=new HashMap<>();

    public static Gymnasium getGymnasium(String exercise){
        Gymnasium gy=gymnasium.get(exercise);
        if (gy == null){
            gy = new Gymnasium(exercise);
            gymnasium.put(exercise,gy);
        }
        return gy;
    }

    public static int getSize(){
        return gymnasium.size();
    }
}
