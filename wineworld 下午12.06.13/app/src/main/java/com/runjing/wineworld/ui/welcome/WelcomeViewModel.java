package com.runjing.wineworld.ui.welcome;

import android.app.Application;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.runjing.wineworld.data.AppRepository;
import com.runjing.wineworld.entity.TestEntity;
import com.runjing.wineworld.ui.login.LoginActivity;
import com.runjing.wineworld.ui.main.MainActivity;
import com.runjing.wineworld.utils.RxTimerUtil;
import com.runjing.wineworld.utils.SpUtil;

import org.rj.bframe.base.BaseViewModel;
import org.rj.bframe.binding.command.BindingAction;
import org.rj.bframe.binding.command.BindingCommand;
import org.rj.bframe.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;


/**
 * @Created: qianxs  on 2020.07.08 13:47.
 * @Describe：引导页面
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 13:47.
 * @Remark:
 */
public class WelcomeViewModel extends BaseViewModel<AppRepository> {

    public TestEntity entity;

    public WelcomeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RxTimerUtil.timer(3000, new RxTimerUtil.IRxNext() {
            @Override
            public void doNext(long number) {
                //获取当前用户登陆状态
                String state = SpUtil.INSTANCE.decodeString("state");
                if ("1".equals(state)) {
                    startActivity(MainActivity.class);
                } else {
                    startActivity(LoginActivity.class);
                }
                finish();
            }
        });
    }


    public void setData(TestEntity testEntity) {
        this.entity = testEntity;
    }

    public BindingCommand clickWelcome = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showLongSafe("shiyi");
            System.out.println("点击了");
            Toast.makeText(getApplication(), "点击了", Toast.LENGTH_LONG).show();
        }
    });

    @Override
    public void onDestroy() {
        super.onDestroy();
        RxTimerUtil.cancel();
    }
}
