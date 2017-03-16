package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Box {
    @Id(autoincrement = true)
    private Long _Id;

    private int itemId;

    @Generated(hash = 64275286)
    public Box(Long _Id, int itemId) {
        this._Id = _Id;
        this.itemId = itemId;
    }

    @Generated(hash = 1015730713)
    public Box() {
    }

    public Long get_Id() {
        return this._Id;
    }

    public void set_Id(Long _Id) {
        this._Id = _Id;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
