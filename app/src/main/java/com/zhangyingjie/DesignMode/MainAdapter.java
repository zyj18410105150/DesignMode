package com.zhangyingjie.DesignMode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017-8-23.
 */
public class MainAdapter extends BaseAdapter {
    private String[] list;
    Context context;

    public MainAdapter(String[] list,Context context){
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public Object getItem(int i) {
        return list[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view==null){
            viewHolder=new ViewHolder();
            view= LayoutInflater.from(context).inflate(R.layout.item_button,null);
            viewHolder.btn_button= (TextView) view.findViewById(R.id.button);
            view.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.btn_button.setText(list[i]);
        return view;
    }

    class ViewHolder{
        TextView btn_button;
    }
}
