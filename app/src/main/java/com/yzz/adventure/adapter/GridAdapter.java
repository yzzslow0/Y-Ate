package com.yzz.adventure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yzz.adventure.R;
import com.yzz.adventure.model.Monster;

import java.util.List;

/**
 * Created by yzz on 2017/3/3.
 */

public class GridAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private int size = 0;
    protected List<Monster> monsters;

    public GridAdapter(Context context, List<Monster> monsters) {
        this.context = context;
        this.inflater= LayoutInflater.from(context);
        this.size = monsters.size();
        this.monsters = monsters;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.grid_item,null);
            holder = new ViewHolder();
            holder.tv_name = (TextView)convertView.findViewById(R.id.grid_item_name);
            holder.progressBar = (ProgressBar) convertView.findViewById(R.id.grid_item_progressBar);
            holder.progressBar2 = (ProgressBar) convertView.findViewById(R.id.grid_item_progressBar2);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
//        holder.tv_name.setText(monsters.get(position).getName());
        holder.tv_name.setText(String.valueOf(position));
//        holder.progressBar.setMax(monsters.get(position).getHp());
//        holder.progressBar.setProgress(monsters.get(position).getHp());
//        holder.progressBar2.setMax(monsters.get(position).getMp());
//        holder.progressBar2.setProgress(monsters.get(position).getMp());
        return convertView;
    }

    static class ViewHolder{
        private TextView tv_name;
        private ProgressBar progressBar;
        private ProgressBar progressBar2;
    }
}
