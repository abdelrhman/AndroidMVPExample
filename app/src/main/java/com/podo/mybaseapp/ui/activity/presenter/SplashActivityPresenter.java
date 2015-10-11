package com.podo.mybaseapp.ui.activity.presenter;



import android.util.Log;

import com.podo.mybaseapp.data.UserManager;
import com.podo.mybaseapp.data.model.User;
import com.podo.mybaseapp.ui.activity.SplashActivity;
import com.podo.mybaseapp.utils.SimpleObserver;
import com.podo.mybaseapp.utils.Validator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by podo on 10/10/15.
 */
public class SplashActivityPresenter {

    private Validator validator;
    private SplashActivity splashActivity;
    private UserManager userManager;
    @Getter @Setter
    private String username;

    public  SplashActivityPresenter(SplashActivity splashActivity,Validator validator, UserManager userManager){
        this.splashActivity = splashActivity;
        this.validator = validator;
        this.userManager = userManager;
    }

    public void onShowRepositoriesClick() {
        if(validator.validUsername(username)){
            splashActivity.showLoading(true);
            userManager.getUser(username).subscribe(new SimpleObserver<User>(){
                @Override
                public void onNext(User user) {
                    splashActivity.showLoading(false);
                    Log.i("onShowRepositoriesClick",user.login);
                }

                @Override
                public void onError(Throwable e) {
                    splashActivity.showLoading(false);
                    splashActivity.showValidationError();

                }
            });

        }else{
            splashActivity.showValidationError();
        }
    }

}
