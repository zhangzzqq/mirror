package com.databox.mirror.function.register;

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

import java.util.ArrayList;
import java.util.List;

/**
 * @Author steven
 * @Description  注册页面
 * @Date  2021/5/10 15:10
 **/
public class RegisterActivity extends BaseActivity implements RegisterContract.View {

    private List mPageList = new ArrayList();
    private ViewPager viewPager;
    private RegisterContract.Presenter mPresenter;
    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        new RegisterPresenter(this);
        initView();

    }

    private void initView() {
       TextView tvPhone =  findViewById(R.id.tv_phone);
       EditText etVerificationCode =  findViewById(R.id.et_verificationcode);
       TextView tvGetVerificationCode =  findViewById(R.id.tv_get_verification_code);
       EditText etInputPassord =  findViewById(R.id.et_input_password);

    }


    public static void startActivity(Context context) {

        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Context getContext() {
        return RegisterActivity.this;
    }

    @Override
    public Activity getActivity() {
        return RegisterActivity.this;
    }

    @Override
    public void showProgressBar(boolean isShow) {

    }

    @Override
    public void setPresenter(RegisterContract.Presenter presenter) {

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

