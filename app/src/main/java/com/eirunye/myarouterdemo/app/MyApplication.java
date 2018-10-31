package com.eirunye.myarouterdemo.app;

import android.app.Application;
import android.content.pm.ApplicationInfo;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author Eirunye
 * Created by on 2018/10/31.
 * Describe
 */
public class MyApplication extends Application {

    private static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
//        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
//        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化

    }

    public static MyApplication getMyApplication() {
        return myApplication;
    }

    private boolean isDebug() {
        return true;
    }


}
