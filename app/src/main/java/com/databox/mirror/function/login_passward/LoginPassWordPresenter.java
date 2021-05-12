package com.databox.mirror.function.login_passward;

import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;


public  class LoginPassWordPresenter implements LoginPassWordContract.Presenter {


    private LoginPassWordContract.View mView ;

    public LoginPassWordPresenter(LoginPassWordContract.View view) {
        this.mView = view;
        mView.setPresenter(this);

    }


    @Override
    public void userLogin(String phone, String password) {

    }

    @Override
    public void riderLogin(String phone, String password) {

    }

    @Override
    public void merchantLogin(String phone, String password) {

    }

    @Override
    public void getVerificationcode(String phone, int timeOut, int type) {

    }
}
