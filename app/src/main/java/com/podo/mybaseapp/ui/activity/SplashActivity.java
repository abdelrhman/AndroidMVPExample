package com.podo.mybaseapp.ui.activity;

import android.os.Bundle;

import com.podo.mybaseapp.R;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void setupActivityComponent() {
    }
}
