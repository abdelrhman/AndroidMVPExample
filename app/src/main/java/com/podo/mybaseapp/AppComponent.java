package com.podo.mybaseapp;

import com.podo.mybaseapp.data.GithubApiModule;
import com.podo.mybaseapp.ui.activity.di.component.SplashActivityComponent;
import com.podo.mybaseapp.ui.activity.di.module.SplashActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by podo on 10/9/15.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                GithubApiModule.class
        }
)
public interface AppComponent {
    SplashActivityComponent plus(SplashActivityModule module);
}
