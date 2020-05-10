package net.guikai.italker.factory.interfac;

import android.util.Log;



import net.guikai.italker.utils.LogD;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @author duanyl1359
 * @e-mail 1359-段元磊-安卓-律师端-android
 * @time 2018/1/31
 * @desc
 * @version:
 */

public class LoggingInterceptorLog implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(String message) {
        //打印retrofit日志
        if(message.length() > 4000) {
            for(int i=0;i<message.length();i+=4000){
                if(i+4000<message.length()){
                    LogD.d(message.substring(i, i+4000));
                }

                else{
                    LogD.d(message.substring(i, message.length()));
                }

            }
        } else{
            LogD.d(message);
        }

//        if(BuildConfig.DEBUG){
//            //测试环境
//        }else{
//            //正式环境不打印日志
//        }
    }
}
