package com.runjing.wineworld.entity;

import android.databinding.BaseObservable;

/**
 * @Created: qianxs  on 2020.07.08 16:53.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.08 16:53.
 * @Remark:
 */
public class TestEntity extends BaseObservable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
