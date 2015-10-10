package com.podo.mybaseapp;

import android.app.Application;

import com.podo.mybaseapp.utils.Validator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by podo on 10/9/15.
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){return application;}

    @Provides
    @Singleton
    public Validator provideValidator(){
        return new Validator();
    }

}
