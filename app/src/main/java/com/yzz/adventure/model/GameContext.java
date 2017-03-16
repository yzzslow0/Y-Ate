package com.yzz.adventure.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by yzz on 2017/3/2.
 */
@Entity
public class GameContext {
    @Id
    private Long _Id;
    private int position;
    private int position2;
    private int gold;
    private int startTime;
    private int endTime;
    private int fightCount;
    private int runCount;
    @Generated(hash = 1149203876)
    public GameContext(Long _Id, int position, int position2, int gold,
            int startTime, int endTime, int fightCount, int runCount) {
        this._Id = _Id;
        this.position = position;
        this.position2 = position2;
        this.gold = gold;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fightCount = fightCount;
        this.runCount = runCount;
    }
    @Generated(hash = 610242663)
    public GameContext() {
    }
    public Long get_Id() {
        return this._Id;
    }
    public void set_Id(Long _Id) {
        this._Id = _Id;
    }
    public int getPosition() {
        return this.position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getGold() {
        return this.gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getStartTime() {
        return this.startTime;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public int getEndTime() {
        return this.endTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public int getFightCount() {
        return this.fightCount;
    }
    public void setFightCount(int fightCount) {
        this.fightCount = fightCount;
    }
    public int getRunCount() {
        return this.runCount;
    }
    public void setRunCount(int runCount) {
        this.runCount = runCount;
    }
    public int getPosition2() {
        return this.position2;
    }
    public void setPosition2(int position2) {
        this.position2 = position2;
    }
}
