package com.databox.mirror.function.login_note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.viewpager.widget.ViewPager;

import com.databox.mirror.R;
import com.databox.mirror.base.BaseActivity;
import com.databox.mirror.model.IdentityType;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author steven
 * @Description 登录页面
 * @Date 2021/5/10 15:10
 **/
public class LoginNoteActivity extends BaseActivity implements LoginNoteContract.View,
        View.OnClickListener {

    private ViewPager viewPager;
    private LoginNoteContract.Presenter mPresenter;
    private ProgressBar mProgressBar;
    private EditText eTPhone;
    private EditText eTVerificationCode;
    private TextView tvGetVerificationCode;
    private TextView tvRegister;
    private TextView tvPasswordLogin;
    private TextView btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_note);
        new LoginNotePresenter(this);
        initView();

    }

    private void initView() {

        eTPhone = findViewById(R.id.et_phone);
        eTVerificationCode = findViewById(R.id.et_verificationcode);
        tvGetVerificationCode = findViewById(R.id.tv_get_verification_code);
        tvRegister = findViewById(R.id.tv_register);
        tvPasswordLogin = findViewById(R.id.tv_password_login);
        btnLogin = findViewById(R.id.btn_login);

        tvGetVerificationCode.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        tvPasswordLogin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_register:

                break;

            case R.id.tv_password_login:

                break;

            case R.id.tv_get_verification_code:
                mPresenter.getVerificationcode(eTPhone.getText().toString(),
                        5*60*1000, IdentityType.login.getValue());
                break;

            case R.id.btn_login:
                mPresenter.userLogin(eTPhone.getText().toString(),
                        eTVerificationCode.getText().toString());
                break;

        }
    }


    public static void startActivity(Context context) {

        Intent intent = new Intent(context, LoginNoteActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Context getContext() {
        return LoginNoteActivity.this;
    }

    @Override
    public Activity getActivity() {
        return LoginNoteActivity.this;
    }

    @Override
    public void showProgressBar(boolean isShow) {
        if (isShow) {
            mProgressBar.setVisibility(View.VISIBLE);
        } else {
            mProgressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public void setPresenter(LoginNoteContract.Presenter presenter) {

        this.mPresenter = presenter;
    }


    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}

