package com.runjing.wineworld.ui.welcome;

import android.databinding.ObservableField;
import android.os.Bundle;

import com.org.bframe.BR;
import com.runjing.wineworld.R;
import com.runjing.wineworld.databinding.ActivityWelcomeBinding;
import com.runjing.wineworld.entity.TestEntity;

import org.rj.bframe.base.BaseActivity;

/**
 * @Created: qianxs  on 2020.07.08 13:46.
 * @Describe：欢迎界面
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 13:46.
 * @Remark:
 */
public class WelcomeActivity extends BaseActivity<ActivityWelcomeBinding, WelcomeViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_welcome;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    /*此类用于测试，如有冗余，请谅解，后期在测试项目框架稳定性问题， 我先学习框架内容，余生很贵，敬请谅解*/
//    @Override
//    public void initData() {
//        super.initData();
//        TestEntity testEntity = new TestEntity();
//        testEntity.setName("welcome");
//        System.out.println("走了吗？？？？");
//        binding.setTestEntity(testEntity);
//        binding.actTvName.setText("测试");
////        viewModel.setData(testEntity);
//    }
}
