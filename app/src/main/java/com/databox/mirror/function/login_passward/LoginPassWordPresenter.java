package com.databox.mirror.function.login_passward;

import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;


public  class LoginPassWordPresenter implements LoginPassWordContract.Presenter {


    private LoginPassWordContract.View mView ;
    private WindowManager mWindowManager=null;
    private WindowManager.LayoutParams wmParams =null;
    private RelativeLayout welcome8WindowLayout =null;
    private ProgressBar progressBar;

    public LoginPassWordPresenter(LoginPassWordContract.View view) {
        this.mView = view;
        mView.setPresenter(this);
    }


    @Override
    public void goIntoOfflinePackage() {

    }

    @Override
    public void setProgressBar(boolean isShow) {
        mView.showProgressBar(isShow);
    }

    @Override
    public void createWindow() {

    }

    @Override
    public void closeWindow() {

    }


    @Override
    public void setWindowProgressBar(boolean isShow) {
        if(progressBar!=null){
            if(isShow){
                progressBar.setVisibility(View.VISIBLE);
            }else {
                progressBar.setVisibility(View.GONE);
            }

        }
    }
}
