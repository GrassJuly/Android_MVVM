package com.runjing.wineworld.data.source;

/**
 * @Created: qianxs  on 2020.07.08 13:46.
 * @Describe：本地缓存通用接口封装
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 13:46.
 * @Remark:
 */
public interface LocalDataSource {
    /**
     * 保存用户名
     */
    void saveUserName(String userName);

    /**
     * 保存用户密码
     */

    void savePassword(String password);

    /**
     * 获取用户名
     */
    String getUserName();

    /**
     * 获取用户密码
     */
    String getPassword();
}
