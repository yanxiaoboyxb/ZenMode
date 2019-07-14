package com.zenmode.yan;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/***
 * @Description: 全局Context类
 * @ClassName: MyApplication
 * @Author: Mr.Yan
 * @Date: 2019/7/13 18:39
 * */
public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }
    public static Context getContext(){
        return context;
    }
}
