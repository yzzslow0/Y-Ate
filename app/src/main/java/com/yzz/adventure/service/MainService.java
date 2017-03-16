package com.yzz.adventure.service;

import com.yzz.adventure.green.GameContextDao;
import com.yzz.adventure.green.PlayerDao;
import com.yzz.adventure.model.GameContext;
import com.yzz.adventure.model.Monster;
import com.yzz.adventure.model.Player;
import com.yzz.adventure.tools.L;
import com.yzz.adventure.tools.Random;
import com.yzz.adventure.tools.greendao.GreenDaoManager;

import org.greenrobot.greendao.annotation.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzz on 2017/3/2.
 */

public class MainService {

    public static boolean CreatePlayer(String name){
        PlayerDao playerDao= GreenDaoManager.getInstance().getSession().getPlayerDao();
        Player player = new Player(null,name,1,0,0,0,10,10,10,10,10,10,0,0,0,0,0,0,10,10,10,10);
        if (playerDao.insert(player)==1){
            return true;
        }else {
            return false;
        }
    }


    public static boolean CreateContext(){
        GameContextDao gameContextDao = GreenDaoManager.getInstance().getSession().getGameContextDao();
        GameContext gameContext = new GameContext(null,0,0,5000,1000,10000,0,0);
        if(gameContextDao.insert(gameContext)==1){
            return true;
        }else {
            return false;
        }

    }

    public static Player PlayerInfo(){
        /**
         * 查询用户列表
         */
        List<Player>  mPlayerList = GreenDaoManager.getInstance().getSession().getPlayerDao().queryBuilder().build().list();

        return mPlayerList.get(0);

//        /**
//         * 查询用户列表
//         */
//        public List<User> queryUserList(int age) {
//            DaoMaster daoMaster = new DaoMaster(getReadableDatabase());
//            DaoSession daoSession = daoMaster.newSession();
//            UserDao userDao = daoSession.getUserDao();
//            QueryBuilder<User> qb = userDao.queryBuilder();
//            qb.where(UserDao.Properties.Age.gt(age)).orderAsc(UserDao.Properties.Age);
//            List<User> list = qb.list();
//            return list;
//        }
    }

    public static GameContext GetPosition(){
        List<GameContext> gameContexts = GreenDaoManager.getInstance().getSession().getGameContextDao().queryBuilder().list();

        return gameContexts.get(0);
    }

    public static List<Monster> GetMonster(int num){
        List<Monster> mMonsters = new ArrayList<>();
        List<Monster> monsters = GreenDaoManager.getInstance().getSession().getMonsterDao().queryBuilder().list();
        for (int i=0;i<num;i++){
            mMonsters.add(monsters.get(Random.GetRandom(monsters.size())));
        }
        return mMonsters;
    }

    public static int HurtNum(){
        List<Player> playerList = GreenDaoManager.getInstance().getSession().getPlayerDao().queryBuilder().where(PlayerDao.Properties.Clazz.eq(0))
                .orderAsc(PlayerDao.Properties._id)
                .build().list();
//        List<User> userList = userDao.queryBuilder()
//                .where(UserDao.Properties.Id.notEq(999))
//                .orderAsc(UserDao.Properties.Id)
//                .limit(5)
//                .build().list();
        return 0;
    }

}
