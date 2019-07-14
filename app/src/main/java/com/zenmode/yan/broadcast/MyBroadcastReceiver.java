package com.zenmode.yan.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/***
 * @Description: 广播接收器
 * @ClassName: MyBroadcast
 * @Author: Mr.Yan
 * @Date: 2019/7/13 18:28
 * */
public class MyBroadcastReceiver extends BroadcastReceiver {
    private final static String LOCK_SCREEN = "";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        
    }
}
