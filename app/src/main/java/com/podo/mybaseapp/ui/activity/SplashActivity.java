package com.podo.mybaseapp.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.podo.mybaseapp.MyBaseApplication;
import com.podo.mybaseapp.R;
import com.podo.mybaseapp.ui.activity.di.module.SplashActivityModule;
import com.podo.mybaseapp.ui.activity.presenter.SplashActivityPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashActivity extends BaseActivity {


    @Bind(R.id.etUsername)
    EditText etUsername;
    @Bind(R.id.btnShowRepositories)
    Button btnShowRepositories;
    @Bind(R.id.pbLoading)
    ProgressBar pbLoading;

    @Inject
    SplashActivityPresenter presenter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnShowRepositories)
    public void onShowRepositoriesClick() {
        presenter.onShowRepositoriesClick();
    }

    @Override
    protected void setupActivityComponent() {
        MyBaseApplication.get(this).getAppComponent().plus(new SplashActivityModule(this)).inject(this);
    }

    public void showLoading(boolean loading) {
        btnShowRepositories.setVisibility(loading ? View.GONE : View.VISIBLE);
        pbLoading.setVisibility(loading ? View.VISIBLE : View.GONE);
    }
}
