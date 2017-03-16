package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class Player {
    @Id
    private Long _id;
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
    private int baseLuck;
    private int baseSpeed;
    private int headImg;
    private int weaponId;
    private int armorId;
    private int shieldId;
    private int ringId;
    private int ring2Id;
    private int hp;
    private int mp;
    private int hpMax;
    private int mpMax;
    @Generated(hash = 1668268892)
    public Player(Long _id, @NotNull String name, int level, int clazz,
            int position, int exp, int baseStr, int baseInt, int baseAgi,
            int baseVit, int baseLuck, int baseSpeed, int headImg, int weaponId,
            int armorId, int shieldId, int ringId, int ring2Id, int hp, int mp,
            int hpMax, int mpMax) {
        this._id = _id;
        this.name = name;
        this.level = level;
        this.clazz = clazz;
        this.position = position;
        this.exp = exp;
        this.baseStr = baseStr;
        this.baseInt = baseInt;
        this.baseAgi = baseAgi;
        this.baseVit = baseVit;
        this.baseLuck = baseLuck;
        this.baseSpeed = baseSpeed;
        this.headImg = headImg;
        this.weaponId = weaponId;
        this.armorId = armorId;
        this.shieldId = shieldId;
        this.ringId = ringId;
        this.ring2Id = ring2Id;
        this.hp = hp;
        this.mp = mp;
        this.hpMax = hpMax;
        this.mpMax = mpMax;
    }
    @Generated(hash = 30709322)
    public Player() {
    }
    public Long get_id() {
        return this._id;
    }
    public void set_id(Long _id) {
        this._id = _id;
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
    public int getBaseLuck() {
        return this.baseLuck;
    }
    public void setBaseLuck(int baseLuck) {
        this.baseLuck = baseLuck;
    }
    public int getBaseSpeed() {
        return this.baseSpeed;
    }
    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
    public int getHpMax() {
        return this.hpMax;
    }
    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }
    public int getMpMax() {
        return this.mpMax;
    }
    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }

}
