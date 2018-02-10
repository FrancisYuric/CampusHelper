package com.example.ciruy.app;

/**
 * Created by xushiyun on 2018/2/10.
 * Project Name: CampusHelper
 * Package Name: com.example.ciruy.app
 * File Name:    Ciruy
 * Description: Todo
 */

import android.content.Context;

import java.util.HashMap;

/**
 * 进行基础设置的配置方面的操作
 */

public final class Ciruy {
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String,Object> getConfigurations() {
        return Configurator.getInstance().getCiruyConfigs();
    }
}
