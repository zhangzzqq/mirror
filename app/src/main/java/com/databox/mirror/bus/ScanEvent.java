package com.databox.mirror.bus;


import androidx.annotation.NonNull;

/**
 * Created by steven on 2016/11/16.
 * 扫码事件
 */
public class ScanEvent {
    private final String data;

    public ScanEvent(String data) {
        this.data = data;
    }

    @NonNull
    public final String getData() {
        return this.data == null ? "" : data.replaceAll("\t|\r|\n","");
    }
}
