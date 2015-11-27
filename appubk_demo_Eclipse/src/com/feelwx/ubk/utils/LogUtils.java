package com.feelwx.ubk.utils;

import android.util.Log;

public class LogUtils {
    private static boolean isDebug = true;
    
    public static void i(String tag, String msg) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.i(tag, msg);
            }
        }
    }

    public static void i(String tag, String msg, Throwable throwable) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.i(tag, msg, throwable);
            }
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.d(tag, msg);
            }
        }
    }

    public static void d(String tag, String msg, Throwable throwable) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.d(tag, msg, throwable);
            }
        }
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.w(tag, msg);
            }
        }
    }

    public static void w(String tag, String msg, Throwable throwable) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.w(tag, msg, throwable);
            }
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.e(tag, msg);
            }
        }
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.e(tag, msg, throwable);
            }
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.v(tag, msg);
            }
        }
    }

    public static void v(String tag, String msg, Throwable throwable) {
        if (isDebug) {
            if(tag != null && msg != null){
                Log.v(tag, msg, throwable);
            }
        }
    }

}
