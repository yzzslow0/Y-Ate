package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Pet {
    @Id
    private Long _Id;

    @Generated(hash = 159862647)
    public Pet(Long _Id) {
        this._Id = _Id;
    }

    @Generated(hash = 1478286243)
    public Pet() {
    }

    public Long get_Id() {
        return this._Id;
    }

    public void set_Id(Long _Id) {
        this._Id = _Id;
    }
}
