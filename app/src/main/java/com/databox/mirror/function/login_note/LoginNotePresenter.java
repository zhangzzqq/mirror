package com.databox.mirror.function.login_note;

import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.databox.mirror.api.callback.DialogCallback;
import com.databox.mirror.common.Constant;
import com.databox.mirror.model.LzyResponse;
import com.databox.mirror.model.ServerModel;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;


public  class LoginNotePresenter implements LoginNoteContract.Presenter {


    private LoginNoteContract.View mView ;
    private WindowManager mWindowManager=null;
    private WindowManager.LayoutParams wmParams =null;
    private RelativeLayout welcome8WindowLayout =null;
    private ProgressBar progressBar;

    public LoginNotePresenter(LoginNoteContract.View view) {
        this.mView = view;
        mView.setPresenter(this);
    }


    @Override
    public void userLogin(String phone, String verificationCode) {
        if(TextUtils.isEmpty(phone)){
            ToastUtils.showShort("手机号不能为空");
            return;
        }
        if(TextUtils.isEmpty(verificationCode)){
            ToastUtils.showShort("验证码不能为空");
            return;
        }
        OkGo.<LzyResponse<ServerModel>>get(Constant.Url)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<LzyResponse<ServerModel>>(mView.getActivity()) {
                    @Override
                    public void onSuccess(Response<LzyResponse<ServerModel>> response) {
//                        handleResponse(response);
                    }

                    @Override
                    public void onError(Response<LzyResponse<ServerModel>> response) {
//                        handleError(response);
                    }
                });



    }

    @Override
    public void riderLogin(String phone, String verificationCode) {

    }

    @Override
    public void merchantLogin(String phone, String verificationCode) {

    }

}

