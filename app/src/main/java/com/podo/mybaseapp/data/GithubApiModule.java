package com.podo.mybaseapp.data;

import android.app.Application;

import com.podo.mybaseapp.R;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by podo on 10/10/15.
 */
@Module
public class GithubApiModule {

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        okHttpClient.interceptors().add(new LoggingInterceptor());
        return okHttpClient;
    }

    @Provides
    @Singleton
    public Retrofit provideRestAdapter(Application application, OkHttpClient okHttpClient) {
        Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl(application.getString(R.string.baseUrl)).
                client(okHttpClient).
                addCallAdapterFactory(RxJavaCallAdapterFactory.create()).
                addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }

    @Provides
    @Singleton
    public GithubApiService provideGithubApiService(Retrofit retrofit){
        return retrofit.create(GithubApiService.class);
    }

    @Provides
    @Singleton
    public UserManager provideUserManager(GithubApiService githubApiService) {
        return new UserManager(githubApiService);
    }

}

