package com.zhangyingjie.DesignMode.PrototypeMethod;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2017-8-23.
 */
public class BaseSpoon implements Cloneable {
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected BaseSpoon clone() throws CloneNotSupportedException {
        BaseSpoon object=null;
        try{
            object=(BaseSpoon) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return object;
    }
    /**
     * 深复制
     */
    public Object deepClone()throws IOException,ClassNotFoundException{
        /**
         * 写入当前对象的二进制流
         */
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**
         * 读出二进制流产生的新对象
         */
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }


}
