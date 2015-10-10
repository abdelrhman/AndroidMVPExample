package com.podo.mybaseapp.ui.activity.presenter;

import android.util.Log;

import com.podo.mybaseapp.utils.Validator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by podo on 10/10/15.
 */
public class SplashActivityPresenter {

    private Validator validator;
    @Getter @Setter
    private String username;

    public  SplashActivityPresenter(Validator validator){
        this.validator = validator;
    }

    public void onShowRepositoriesClick() {
        Log.i("SplashActivityPresenter","onShowRepositoriesClick "+username);
    }

}
