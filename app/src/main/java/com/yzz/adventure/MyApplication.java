package com.yzz.adventure;

import android.app.Application;

import com.yzz.adventure.tools.ContextHolder;
import com.yzz.adventure.tools.greendao.GreenDaoManager;

/**
 * Created by yzz on 2017/3/2.
 */

public class MyApplication extends Application  {

    public static MyApplication instances;

    @Override
    public void onCreate() {
        super.onCreate();

        instances = this;
        ContextHolder.initial(this);
        GreenDaoManager.getInstance();
    }
}
