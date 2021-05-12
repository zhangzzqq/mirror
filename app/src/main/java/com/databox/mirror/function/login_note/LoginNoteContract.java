package com.databox.mirror.function.login_note;

import android.app.Activity;
import android.content.Context;

import com.databox.mirror.base.BasePresenter;
import com.databox.mirror.base.BaseView;


public class LoginNoteContract {

    public interface View extends BaseView<Presenter> {

        Context getContext();
        Activity getActivity();
        void showProgressBar(boolean isShow);

    }

    public interface Presenter extends BasePresenter {

      void userLogin(String phone,String verificationCode);
      void riderLogin(String phone,String verificationCode);
      void merchantLogin(String phone,String verificationCode);
      void getVerificationcode (String phone,int timeOut,int type);






    }




}
