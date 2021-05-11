package com.databox.mirror.function.login_passward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.viewpager.widget.ViewPager;

import com.databox.mirror.R;
import com.databox.mirror.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author steven
 * @Description  登录页面
 * @Date  2021/5/10 15:10
 **/
public class LoginPassWordActivity extends BaseActivity implements LoginPassWordContract.View {
    /**
     * 存放图片数组
     */
    private List mPageList = new ArrayList();
    private ViewPager viewPager;
    private LoginPassWordContract.Presenter mPresenter;
    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_note);
        new LoginPassWordPresenter(this);
        initView();

    }

    private void initView() {

    }


    public static void startActivity(Context context) {
//        Intent intent = new Intent(context, LoginNoteActivity.class);
//        context.startActivity(intent);
    }

    @Override
    public Context getContext() {
        return LoginPassWordActivity.this;
    }

    @Override
    public Activity getActivity() {
        return LoginPassWordActivity.this;
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
    public void setPresenter(LoginPassWordContract.Presenter presenter) {

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

