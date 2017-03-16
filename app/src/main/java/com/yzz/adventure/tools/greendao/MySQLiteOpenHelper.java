package com.yzz.adventure.tools.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.yzz.adventure.green.DaoMaster;
import com.yzz.adventure.green.PlayerDao;

import org.greenrobot.greendao.database.Database;

/**
 * Created by yzz on 2017/3/2.
 */

public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    /**
     * 数据库升级
     *
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        //操作数据库的更新
        MigrationHelper.migrate(db, PlayerDao.class);
    }

}