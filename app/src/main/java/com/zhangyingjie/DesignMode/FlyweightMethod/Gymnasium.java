package com.zhangyingjie.DesignMode.FlyweightMethod;

/**
 * Created by Administrator on 2017-10-9.
 * 体育馆
 */

public class Gymnasium implements Architecture {
    private String name;
    private String shape;
    private String exercise;

    public Gymnasium(String exercise){
        this.setExercise(exercise);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    @Override
    public void use() {
        System.out.print("名称为："+name+"   运动为："+exercise+"    形状为："+shape);
    }
}
