package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Monster {
    @Id(autoincrement = true)
    private Long _Id;
    @NotNull
    private String name;
    private int level;
    private int clazz;
    private int position;
    private int exp;
    private int baseStr;
    private int baseInt;
    private int baseAgi;
    private int baseVit;
    private int headImg;
    private int weaponId;
    private int armorId;
    private int shieldId;
    private int ringId;
    private int ring2Id;
    private String describe;
    private int hp;
    private int mp;
    @Generated(hash = 2010607029)
    public Monster(Long _Id, @NotNull String name, int level, int clazz,
            int position, int exp, int baseStr, int baseInt, int baseAgi,
            int baseVit, int headImg, int weaponId, int armorId, int shieldId,
            int ringId, int ring2Id, String describe, int hp, int mp) {
        this._Id = _Id;
        this.name = name;
        this.level = level;
        this.clazz = clazz;
        this.position = position;
        this.exp = exp;
        this.baseStr = baseStr;
        this.baseInt = baseInt;
        this.baseAgi = baseAgi;
        this.baseVit = baseVit;
        this.headImg = headImg;
        this.weaponId = weaponId;
        this.armorId = armorId;
        this.shieldId = shieldId;
        this.ringId = ringId;
        this.ring2Id = ring2Id;
        this.describe = describe;
        this.hp = hp;
        this.mp = mp;
    }
    @Generated(hash = 173869498)
    public Monster() {
    }
    public Long get_Id() {
        return this._Id;
    }
    public void set_Id(Long _Id) {
        this._Id = _Id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return this.level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getClazz() {
        return this.clazz;
    }
    public void setClazz(int clazz) {
        this.clazz = clazz;
    }
    public int getPosition() {
        return this.position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getExp() {
        return this.exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getBaseStr() {
        return this.baseStr;
    }
    public void setBaseStr(int baseStr) {
        this.baseStr = baseStr;
    }
    public int getBaseInt() {
        return this.baseInt;
    }
    public void setBaseInt(int baseInt) {
        this.baseInt = baseInt;
    }
    public int getBaseAgi() {
        return this.baseAgi;
    }
    public void setBaseAgi(int baseAgi) {
        this.baseAgi = baseAgi;
    }
    public int getBaseVit() {
        return this.baseVit;
    }
    public void setBaseVit(int baseVit) {
        this.baseVit = baseVit;
    }
    public int getHeadImg() {
        return this.headImg;
    }
    public void setHeadImg(int headImg) {
        this.headImg = headImg;
    }
    public int getWeaponId() {
        return this.weaponId;
    }
    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }
    public int getArmorId() {
        return this.armorId;
    }
    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }
    public int getShieldId() {
        return this.shieldId;
    }
    public void setShieldId(int shieldId) {
        this.shieldId = shieldId;
    }
    public int getRingId() {
        return this.ringId;
    }
    public void setRingId(int ringId) {
        this.ringId = ringId;
    }
    public int getRing2Id() {
        return this.ring2Id;
    }
    public void setRing2Id(int ring2Id) {
        this.ring2Id = ring2Id;
    }
    public String getDescribe() {
        return this.describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}
