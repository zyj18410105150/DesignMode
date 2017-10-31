package com.zhangyingjie.DesignMode.FacadeMethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyingjie.DesignMode.R;

/**
 * 外观模式（Facade）
 */
public class FacadeMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_method);

        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
