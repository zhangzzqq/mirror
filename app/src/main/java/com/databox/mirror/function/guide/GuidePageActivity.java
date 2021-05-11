package com.databox.mirror.function.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.viewpager.widget.ViewPager;

import com.databox.mirror.R;
import com.databox.mirror.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * author: steven
 * date: 2021/1/28
 * desc:引导页面
 */
public class GuidePageActivity extends BaseActivity implements GuidePageContract.View {
    /**
     * 存放图片数组
     */
    private List mPageList = new ArrayList();
    private ViewPager viewPager;
    private GuidePageContract.Presenter mPresenter;
    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_guidepage);

        new GuidePagePresenter(this);
        initView();

    }

    private void initView() {
    }


    public static void startActivity(Context context) {

        Intent intent = new Intent(context, GuidePageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Context getContext() {
        return GuidePageActivity.this;
    }

    @Override
    public Activity getActivity() {
        return GuidePageActivity.this;
    }

    @Override
    public void showProgressBar(boolean isShow) {
    }

    @Override
    public void setPresenter(GuidePageContract.Presenter presenter) {

        this.mPresenter = presenter;
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.closeWindow();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.closeWindow();
    }



}

