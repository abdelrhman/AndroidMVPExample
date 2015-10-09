package com.podo.mybaseapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by podo on 10/9/15.
 */
public class MyBaseApplication extends Application {

    private  AppComponent appComponent;

    public static MyBaseApplication get(Context context){
        return (MyBaseApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initAppComponent();

    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
