package com.podo.mybaseapp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by podo on 10/9/15.
 */
@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {

}
