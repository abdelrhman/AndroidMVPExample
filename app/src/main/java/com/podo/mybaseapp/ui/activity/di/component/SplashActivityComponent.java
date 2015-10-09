package com.podo.mybaseapp.ui.activity.di.component;

import com.podo.mybaseapp.ui.activity.SplashActivity;
import com.podo.mybaseapp.ui.activity.di.ActivityScope;
import com.podo.mybaseapp.ui.activity.di.module.SplashActivityModule;

import dagger.Subcomponent;

/**
 * Created by podo on 10/10/15.
 */
@ActivityScope
@Subcomponent(modules = {SplashActivityModule.class})
public interface SplashActivityComponent {
    SplashActivity inject(SplashActivity splashActivity);
}
