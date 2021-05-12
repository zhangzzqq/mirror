package com.databox.mirror.function.login_note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.viewpager.widget.ViewPager;

import com.databox.mirror.R;
import com.databox.mirror.base.BaseActivity;

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
    private TextView tvPhone;
    private TextView tvVerificationCode;
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

        tvPhone = findViewById(R.id.tv_phone);
        tvVerificationCode = findViewById(R.id.tv_verificationcode);
        tvRegister = findViewById(R.id.tv_register);
        tvPasswordLogin = findViewById(R.id.tv_password_login);
        btnLogin = findViewById(R.id.btn_login);

        tvPhone.setOnClickListener(this);
        tvVerificationCode.setOnClickListener(this);
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

            case R.id.btn_login:
                mPresenter.userLogin(tvPhone.getText().toString(),
                        tvVerificationCode.getText().toString());
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

