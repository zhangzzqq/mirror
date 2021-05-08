package com.databox.mirror.api;

import android.content.Context;


import com.databox.mirror.service.RetrofitHelper;
import com.databox.mirror.service.RetrofitService;



/**
 * Created by win764-1 on .
 */

public class DataManager2 {
    private RetrofitService mRetrofitService;
    public DataManager2(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
//    public Observable<Book> getSearchBooks(String name, String tag, int start, int count){
//        return mRetrofitService.getSearchBooks(name,tag,start,count);
//    }
}
