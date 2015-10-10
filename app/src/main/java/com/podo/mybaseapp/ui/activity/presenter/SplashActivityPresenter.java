package com.podo.mybaseapp.ui.activity.presenter;

import android.util.Log;

import com.podo.mybaseapp.ui.activity.SplashActivity;
import com.podo.mybaseapp.utils.Validator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by podo on 10/10/15.
 */
public class SplashActivityPresenter {

    private Validator validator;
    private SplashActivity splashActivity;
    @Getter @Setter
    private String username;

    public  SplashActivityPresenter(SplashActivity splashActivity,Validator validator){
        this.splashActivity = splashActivity;
        this.validator = validator;
    }

    public void onShowRepositoriesClick() {
        if(validator.validUsername(username)){
            splashActivity.showLoading(true);
        }else{
            splashActivity.showValidationError();
        }
    }

}
