package com.databox.mirror.common.notification;

import android.content.Context;
import android.widget.Toast;



/**
 * Created by steven on 2016/10/20.
 */
public class ToastAudioNotification implements INotification {
    private Toast toast;
    private Context mContext;

    public ToastAudioNotification(Context context) {
        this.mContext = context;
    }

    @Override
    public void showError(String error) {
        showToast(error);
    }

    @Override
    public void showWarning(String warning) {
        showToast(warning);
    }

    @Override
    public void showInfo(String info) {
        showToast(info);
    }

    private void showToast(String content) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
        toast.setText(content);
        toast.show();
    }
}
