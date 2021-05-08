package com.databox.mirror.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;



public class ScanReceiver extends BroadcastReceiver {

    /**
     * 东大集成Seuic AUTOID9 PDA扫码广播事件
     */
    private static final String ACTION_SCAN_SEUIC = "com.android.server.scannerservice.broadcast";
    /**
     * 东大集成Seuic AUTOID9 PDA扫码返回值的key
     */
    private static final String KEY_ACTION_SCAN_DATA_SEUIC = "scannerdata";

    /**
     * 目前用户：苏州九龙医院
     * 识凌科技BayNexus PDA扫码广播事件
     */
    private static final String ACTION_SCAN_BAYNEXUS = "SYSTEM_BAR_READ";
    /**
     * 识凌科技BayNexus PDA扫码广播事件返回值的key
     */
    private static final String KEY_ACTION_SCAN_DATA_BAYNEXUS = "BAR_VALUE";

    /**
     * LACHESIS PDA扫码广播事件
     */
    private static final String ACTION_SCAN_LACHESIS = "lachesis_barcode_value_notice_broadcast";
    /**
     * LACHESIS PDA扫码广播事件返回值的key
     */
    private static final String KEY_ACTION_SCAN_DATA_LACHESIS = "lachesis_barcode_value_notice_broadcast_data_string";

    @Override
    public void onReceive(Context context, Intent intent) {
    }
//        if (event != null) {
//            EventBus.getDefault().post(event);
//        }
}