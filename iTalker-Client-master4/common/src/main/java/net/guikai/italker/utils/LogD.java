package net.guikai.italker.utils;

import android.util.Log;

public class LogD {
    public static final String TAG="HTTP-QUERY";
    public static void d(String msg){
        d(TAG,msg);
    }
    private static void d(String tag, String msg) {
        //开关
        Log.d(tag,msg);
    }


}
