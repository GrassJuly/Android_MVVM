package com.runjing.wineworld.ui.login;

import android.app.Activity;
import android.app.Application;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.View;

import com.runjing.wineworld.data.AppRepository;
import com.runjing.wineworld.ui.base.viewmodel.ToolbarViewModel;

import org.rj.bframe.base.BaseModel;
import org.rj.bframe.base.BaseViewModel;

/**
 * @Created: qianxs  on 2020.07.07 02:41.
 * @Describe：登陆
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.07 02:41.
 * @Remark:
 */
public class LoginViewModle extends ToolbarViewModel<AppRepository> {

    public LoginViewModle(@NonNull Application application) {
        super(application);
    }

    public LoginViewModle(@NonNull Application application, AppRepository model) {
        super(application, model);
    }

//    @Override
//    public void initToolBar(Activity activity, int color) {
//        super.initToolBar(activity, color);
//        setTitleVisiable(View.VISIBLE);
//        setTitleBackground(color);
//        setTitleText("登陆");
//    }



}
