package com.databox.mirror.function.login_note;

import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.databox.mirror.common.Urls;
import com.databox.mirror.function.main.MainActivity;
import com.databox.mirror.model.BaseResponse;
import com.databox.mirror.utils.JLog;
import com.databox.mirror.utils.JumpUtils;
import com.google.gson.Gson;

import org.json.JSONObject;


public class LoginNotePresenter implements LoginNoteContract.Presenter {


    private LoginNoteContract.View mView;
    private WindowManager mWindowManager = null;
    private WindowManager.LayoutParams wmParams = null;
    private RelativeLayout welcome8WindowLayout = null;
    private ProgressBar progressBar;

    public LoginNotePresenter(LoginNoteContract.View view) {
        this.mView = view;
        mView.setPresenter(this);
    }


    @Override
    public void userLogin(String phone, String verificationCode) {
        if (TextUtils.isEmpty(phone)) {
            ToastUtils.showShort("手机号不能为空");
            return;
        }
        if (TextUtils.isEmpty(verificationCode)) {
            ToastUtils.showShort("验证码不能为空");
            return;
        }

        AndroidNetworking.get(Urls.URL_LOGIN_NOTE)
                .addQueryParameter("phone_number", phone)
                .addQueryParameter("sms_code", verificationCode)
                .setTag("login_note")
                .setPriority(Priority.HIGH)
                .build()
                .getAsObject(BaseResponse.class, new ParsedRequestListener<BaseResponse>() {
                    @Override
                    public void onResponse(BaseResponse baseResponse) {
                        int code  = baseResponse.resultCode;
                        if (code == 200) {
                            String token = (String) baseResponse.data;
                            SPUtils.getInstance().put("token",token);
                            JumpUtils.JumpTo(mView.getActivity(), MainActivity.class);
                        }else {
                            ToastUtils.showShort(baseResponse.message);
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        JLog.e(anError.toString());
                        ToastUtils.showShort(anError.toString());
                    }
                });


    }

    @Override
    public void getVerificationcode(String phone, int timeOut, int type) {
        if (TextUtils.isEmpty(phone)) {
            ToastUtils.showShort("手机号不能为空");
            return;
        }

        AndroidNetworking.get(Urls.URL_SMS_SEND)
                .addQueryParameter("phone_number", phone)
                .addQueryParameter("seconds", "" + timeOut)
                .addQueryParameter("type", "" + type)
                .setTag("getVerificationcode")
                .setPriority(Priority.HIGH)
                .build()
                .getAsObject(BaseResponse.class, new ParsedRequestListener<BaseResponse>() {
                    @Override
                    public void onResponse(BaseResponse baseResponse) {
                        // do anything with response
                        int code  = baseResponse.resultCode;
                        if (code != 200) {
                            JLog.e(baseResponse.message);
                        }
                        ToastUtils.showShort(baseResponse.message);
                    }

                    @Override
                    public void onError(ANError anError) {
                        // handle error
                        JLog.e(anError.toString());
                        ToastUtils.showShort(anError.toString());
                    }
                });


//        OkGo.<LzyResponse<ServerModel>>get(Urls.URL_LOGIN_VERIFY)
//                .tag(this)
//                .params("phone_number", phone)
//                .params("seconds", timeOut)
//                .params("type", type)
//                .execute(new Call<String>());

//                .execute(new DialogCallback<LzyResponse<ServerModel>>(mView.getActivity()) {
//                    @Override
//                    public void onSuccess(Response<LzyResponse<ServerModel>> response) {
//                        JLog.e("onSuccess=",new Gson().toJson(response));
//                    }
//
//                    @Override
//                    public void onError(Response<LzyResponse<ServerModel>> response) {
//                        JLog.e("onError=",new Gson().toJson(response));
//                    }
//                });

    }


    @Override
    public void riderLogin(String phone, String verificationCode) {

    }

    @Override
    public void merchantLogin(String phone, String verificationCode) {

    }


}

