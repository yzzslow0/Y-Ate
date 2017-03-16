package com.yzz.adventure.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yzz.adventure.R;
import com.yzz.adventure.model.Monster;

import java.util.List;

/**
 * Created by yzz on 2017/3/8.
 */

public class RecyclerHAdapter extends BaseQuickAdapter<Monster, BaseViewHolder> {
    private List<Monster> data;
    private int[] monster_checked;


    public RecyclerHAdapter(int layoutResId, List<Monster> data, int[] monster_checked) {
        super(layoutResId, data);
            this.monster_checked = monster_checked;
            this.data = data;
    }


    @Override
    protected void convert(BaseViewHolder helper, Monster item) {
        if (monster_checked[helper.getLayoutPosition()]==1){
//            helper.setChecked(R.id.grid_item_all,true);
            helper.setBackgroundRes(R.id.grid_item_all,R.color.color_title);
        }else {
//            helper.setChecked(R.id.grid_item_all,false);
            helper.setBackgroundRes(R.id.grid_item_all,R.color.color_white);
        }

        helper.setText(R.id.grid_item_name,data.get(helper.getLayoutPosition()).getName());

    }
}
