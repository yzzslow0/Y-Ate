package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Stroy {
    @Id(autoincrement = true)
    private Long _Id;
    private int type;
    private int hurt;
    private int treat;//治疗
    private int gold;
    private String itemId;
    @Generated(hash = 1691829545)
    public Stroy(Long _Id, int type, int hurt, int treat, int gold, String itemId) {
        this._Id = _Id;
        this.type = type;
        this.hurt = hurt;
        this.treat = treat;
        this.gold = gold;
        this.itemId = itemId;
    }
    @Generated(hash = 1428544467)
    public Stroy() {
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
    public int getHurt() {
        return this.hurt;
    }
    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
    public int getTreat() {
        return this.treat;
    }
    public void setTreat(int treat) {
        this.treat = treat;
    }
    public int getGold() {
        return this.gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public String getItemId() {
        return this.itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
