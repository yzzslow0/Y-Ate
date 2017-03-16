package com.yzz.adventure.tools;

import android.content.Context;

/**
 * Created by yzz on 2017/3/2.
 */

public class ContextHolder {

    static Context ApplicationContext;

    public static void initial(Context context) {
        ApplicationContext = context;
    }

    public static Context getContext() {
        return ApplicationContext;
    }
}
