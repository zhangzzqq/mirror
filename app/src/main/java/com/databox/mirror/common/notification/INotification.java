package com.databox.mirror.common.notification;

/**
 * Created by steven on 2016/10/20.
 */
public interface INotification {
    void showError(String error);

    void showWarning(String warning);

    void showInfo(String info);
}
