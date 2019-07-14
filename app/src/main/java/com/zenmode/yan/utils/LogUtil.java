package com.zenmode.yan.utils;

import android.util.Log;

/***
 * @Description: 日志工具类
 * @ClassName: LogUtil
 * @Author: Mr.Yan
 * @Date: 2019/7/14 4:32
 * */
public class LogUtil {
    private static final String APP_FLAG = "com.zenmode.yan_";
    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;
    private static int level = VERBOSE;

    public static void v(String tag, String msg) {
        if (level <= VERBOSE) {
            Log.v(APP_FLAG + tag, msg);
        }
    }
    public static void d(String tag, String msg) {
        if (level <= DEBUG) {
            Log.d(APP_FLAG + tag, msg);
        }
    }
    public static void i(String tag, String msg) {
        if (level <= INFO) {
            Log.i(APP_FLAG + tag, msg);
        }
    }
    public static void w(String tag, String msg) {
        if (level <= WARN) {
            Log.w(APP_FLAG + tag, msg);
        }
    }
    public static void e(String tag, String msg) {
        if (level <= ERROR) {
            Log.e(APP_FLAG + tag, msg);
        }
    }
}
