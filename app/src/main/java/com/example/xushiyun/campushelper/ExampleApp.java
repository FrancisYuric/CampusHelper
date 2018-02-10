package com.example.xushiyun.campushelper;

import android.annotation.SuppressLint;
import android.app.Application;

import com.example.ciruy.app.Ciruy;

/**
 * Created by xushiyun on 2018/2/10.
 * Project Name: CampusHelper
 * Package Name: com.example.xushiyun.campushelper
 * File Name:    ExampleApp
 * Description: Todo
 */


public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Ciruy.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
