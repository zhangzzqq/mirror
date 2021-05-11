package com.databox.mirror.function.login_passward;

import android.app.Activity;
import android.content.Context;

import com.databox.mirror.base.BasePresenter;
import com.databox.mirror.base.BaseView;


public class LoginPassWordContract {

    public interface View extends BaseView<Presenter> {

        Context getContext();
        Activity getActivity();
        void showProgressBar(boolean isShow);

    }

    public interface Presenter extends BasePresenter {

        void goIntoOfflinePackage();
        void setProgressBar(boolean isShow);
        void createWindow();
        void closeWindow();
        void setWindowProgressBar(boolean isShow);

    }




}
