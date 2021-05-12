//package com.databox.mirror.function.forgetpassword;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ProgressBar;
//
//import androidx.viewpager.widget.ViewPager;
//
//import com.databox.mirror.R;
//import com.databox.mirror.base.BaseActivity;
//import com.databox.mirror.function.login_note.LoginNoteContract;
//import com.databox.mirror.function.login_note.LoginNotePresenter;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author steven
// * @Description  忘记密码
// * @Date  2021/5/10 15:10
// **/
//public class ForgetPasswordActivity extends BaseActivity implements LoginNoteContract.View {
//    /**
//     * 存放图片数组
//     */
//    private List mPageList = new ArrayList();
//    private ViewPager viewPager;
//    private LoginNoteContract.Presenter mPresenter;
//    private ProgressBar mProgressBar;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_note);
//        new LoginNotePresenter(this);
//        initView();
//
//    }
//
//    private void initView() {
//    }
//
//
//    public static void startActivity(Context context) {
//
//        Intent intent = new Intent(context, ForgetPasswordActivity.class);
//        context.startActivity(intent);
//    }
//
//    @Override
//    public Context getContext() {
//        return ForgetPasswordActivity.this;
//    }
//
//    @Override
//    public Activity getActivity() {
//        return ForgetPasswordActivity.this;
//    }
//
//    @Override
//    public void showProgressBar(boolean isShow) {
//        if (isShow) {
//            mProgressBar.setVisibility(View.VISIBLE);
//        } else {
//            mProgressBar.setVisibility(View.GONE);
//        }
//    }
//
//    @Override
//    public void setPresenter(LoginNoteContract.Presenter presenter) {
//
//        this.mPresenter = presenter;
//    }
//
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//
//
//
//}
//
