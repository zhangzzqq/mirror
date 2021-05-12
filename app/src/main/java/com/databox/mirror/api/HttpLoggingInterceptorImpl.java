package com.databox.mirror.api;


import com.lzy.okgo.interceptor.HttpLoggingInterceptor;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Date：2021/5/12
 * Time：09:49
 * author:Stenven
 **/
public class HttpLoggingInterceptorImpl extends HttpLoggingInterceptor {

    public HttpLoggingInterceptorImpl(String tag) {
        super(tag);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response;
        try {
            response = chain.proceed(request);
        } catch (Exception e) {
            throw e;
        }
        return null;
    }
}
