package com.yzz.adventure.service;


import com.yzz.adventure.green.MonsterDao;
import com.yzz.adventure.model.Monster;
import com.yzz.adventure.tools.greendao.GreenDaoManager;

/**
 * Created by yzz on 2017/3/7.
 */

public class TestService {

    public static void CreateMonster(){

            MonsterDao monsterDao = GreenDaoManager.getInstance().getSession().getMonsterDao();

            for (int i=0;i<100;i++) {
                Monster monster = new Monster(null,"monster"+i,1,0,0,10,10,10,10,10,0,2,1,1,0,0,"呵呵哒",10,10);
                monsterDao.insert(monster);
            }
    }
}
