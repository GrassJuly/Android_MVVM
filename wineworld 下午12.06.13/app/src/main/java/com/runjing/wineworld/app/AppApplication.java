package com.runjing.wineworld.app;

import android.support.multidex.MultiDex;

import com.org.bframe.BuildConfig;
import com.runjing.wineworld.R;
import com.runjing.wineworld.ui.login.LoginActivity;
import com.squareup.leakcanary.LeakCanary;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.mmkv.MMKV;

import org.rj.bframe.base.BaseApplication;
import org.rj.bframe.crash.CaocConfig;
import org.rj.bframe.utils.KLog;

/**
 * @Created: qianxs  on 2020.07.07 02:27.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.07 02:27.
 * @Remark:
 */
public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(BuildConfig.DEBUG);
        //初始化全局异常崩溃
        initCrash();
        //内存泄漏检测
        if (!LeakCanary.isInAnalyzerProcess(this)) {
            LeakCanary.install(this);
        }
        //初始化mmkv
        MMKV.initialize(this);
        //解决65535问题
        MultiDex.install(this);
        //线上检测
        CrashReport.initCrashReport(getApplicationContext(), "92a7c20823", false);
    }

    private void initCrash() {
        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //背景模式,开启沉浸式
                .enabled(true) //是否启动全局异常捕获
                .showErrorDetails(true) //是否显示错误详细信息
                .showRestartButton(true) //是否显示重启按钮
                .trackActivities(true) //是否跟踪Activity
                .minTimeBetweenCrashesMs(2000) //崩溃的间隔时间(毫秒)
                .errorDrawable(R.mipmap.ic_launcher) //错误图标
                .restartActivity(LoginActivity.class) //重新启动后的activity
//                .errorActivity(YourCustomErrorActivity.class) //崩溃后的错误activity
//                .eventListener(new YourCustomEventListener()) //崩溃后的错误监听
                .apply();
    }
}
