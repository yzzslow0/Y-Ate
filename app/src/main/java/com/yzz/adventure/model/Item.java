package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Item {
    @Id(autoincrement = true)
    private Long _Id;
    /**
     * 0 G
     * 1 D
     * 2 J
     * 3 F
     * 4 Z
     * 5 B
     * 6 HM
     * 7 关键
     */
    private int type ;
    /**
     * 0单
     * 1双
     */
    private int clazz;
    @Generated(hash = 461858700)
    public Item(Long _Id, int type, int clazz) {
        this._Id = _Id;
        this.type = type;
        this.clazz = clazz;
    }
    @Generated(hash = 1470900980)
    public Item() {
    }
    public Long get_Id() {
        return this._Id;
    }
    public void set_Id(Long _Id) {
        this._Id = _Id;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getClazz() {
        return this.clazz;
    }
    public void setClazz(int clazz) {
        this.clazz = clazz;
    }
}
