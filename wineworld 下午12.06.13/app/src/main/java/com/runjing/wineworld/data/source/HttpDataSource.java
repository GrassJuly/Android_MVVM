package com.runjing.wineworld.data.source;


import com.runjing.wineworld.entity.DemoEntity;

import org.rj.bframe.http.BaseResponse;

import io.reactivex.Observable;

/**
 * @Created: qianxs  on 2020.07.08 13:46.
 * @Describe：网络请求方法抽象基类
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 13:46.
 * @Remark:
 */
public interface HttpDataSource {
    //模拟登录
    Observable<Object> login();





    //模拟上拉加载
    Observable<DemoEntity> loadMore();

    Observable<BaseResponse<DemoEntity>> demoGet();

    Observable<BaseResponse<DemoEntity>> demoPost(String catalog);


}
