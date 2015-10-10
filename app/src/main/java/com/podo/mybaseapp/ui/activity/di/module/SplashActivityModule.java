package com.podo.mybaseapp.ui.activity.di.module;

import com.podo.mybaseapp.ui.activity.SplashActivity;
import com.podo.mybaseapp.ui.activity.di.ActivityScope;
import com.podo.mybaseapp.ui.activity.presenter.SplashActivityPresenter;
import com.podo.mybaseapp.utils.Validator;

import dagger.Module;
import dagger.Provides;

/**
 * Created by podo on 10/10/15.
 */
@Module
public class SplashActivityModule {
    private final SplashActivity splashActivity;

    public SplashActivityModule(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
    }

    @Provides
    @ActivityScope
    SplashActivity provideSplashActivity(){return splashActivity;}

    @Provides
    @ActivityScope
    SplashActivityPresenter provideSplashActivityPresenter(Validator validator){
        return new SplashActivityPresenter(splashActivity,validator);
    }

}
