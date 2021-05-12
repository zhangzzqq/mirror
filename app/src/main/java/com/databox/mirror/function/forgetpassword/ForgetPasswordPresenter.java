//package com.databox.mirror.function.forgetpassword;
//
//import android.view.View;
//import android.view.WindowManager;
//import android.widget.ProgressBar;
//import android.widget.RelativeLayout;
//
//import com.databox.mirror.function.login_note.LoginNoteContract;
//
//
//public  class ForgetPasswordPresenter implements LoginNoteContract.Presenter {
//    private LoginNoteContract.View mView ;
//    private WindowManager mWindowManager=null;
//    private WindowManager.LayoutParams wmParams =null;
//    private RelativeLayout welcome8WindowLayout =null;
//    private ProgressBar progressBar;
//
//    public ForgetPasswordPresenter(LoginNoteContract.View view) {
//        this.mView = view;
//        mView.setPresenter(this);
//    }
//
//
//    @Override
//    public void goIntoOfflinePackage() {
//
//    }
//
//    @Override
//    public void setProgressBar(boolean isShow) {
//        mView.showProgressBar(isShow);
//    }
//
//    @Override
//    public void createWindow() {
//
//    }
//
//    @Override
//    public void closeWindow() {
//
//    }
//
//
//    @Override
//    public void setWindowProgressBar(boolean isShow) {
//        if(progressBar!=null){
//            if(isShow){
//                progressBar.setVisibility(View.VISIBLE);
//            }else {
//                progressBar.setVisibility(View.GONE);
//            }
//
//        }
//    }
//}
