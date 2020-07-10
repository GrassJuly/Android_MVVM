package com.runjing.wineworld.data.source.http.service;


import com.runjing.wineworld.entity.DemoEntity;

import org.rj.bframe.http.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @Created: qianxs  on 2020.07.08 13:46.
 * @Describe：参数域名
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 13:46.
 * @Remark:
 */

public interface ApiService {
    @GET("action/apiv2/banner?catalog=1")
    Observable<BaseResponse<DemoEntity>> demoGet();

    @FormUrlEncoded
    @POST("action/apiv2/banner")
    Observable<BaseResponse<DemoEntity>> demoPost(@Field("catalog") String catalog);
}
