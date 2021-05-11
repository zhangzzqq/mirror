package com.databox.mirror.function.guide;

import android.graphics.PixelFormat;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.databox.mirror.utils.JLog;


public  class GuidePagePresenter implements GuidePageContract.Presenter {


    private GuidePageContract.View mView ;
    private WindowManager mWindowManager=null;
    private WindowManager.LayoutParams wmParams =null;
    private RelativeLayout welcome8WindowLayout =null;
    private ProgressBar progressBar;

    public GuidePagePresenter(GuidePageContract.View view) {
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

        setWindowProgressBar(false);

        if ( mWindowManager != null) {
            try {
                mWindowManager.removeView(welcome8WindowLayout);
                mView.getActivity().finish();
                JLog.e("splashToH5View  dissmiss  SUCCESS");
            } catch (Exception e) {
                e.printStackTrace();
                JLog.e( "splashToH5View  dissmiss  ERROR");
            }
        }
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
