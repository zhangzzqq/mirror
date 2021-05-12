/*
 * Copyright 2016 jeasonlzy(廖子尧)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.databox.mirror.common;

/**
 * @Author steven
 * @Description  接口请求类
 * @Date  2021/5/12 22:24
 * @Param
 * @return
 *
 * 其中type:
 * 0: 登录验证
 * 1: 注册验证
 * 2: 修改密码验证
 * 其他：身份验证
 **/
public class Urls {
    public static final String SERVER = "http://114.220.25.153:9189";
    public static final String URL_LOGIN_PASSWORD = SERVER + "/user/login_password";//用户密码登录
    public static final String URL_LOGIN_NOTE = SERVER + "/user/login_sms";//短信验证登录
    public static final String URL_SMS_SEND = SERVER + "/user/login_sms_send";// 用户短信验证码发送
    public static final String URL_USER_QUERY = SERVER + "/user/mine";//查询用户
    public static final String URL_LOGIN_REGISTER = SERVER + "/user/register";//用户注册
    public static final String URL_SET_PASSWORD = SERVER + "/user/set_password";//用户设置密码





}
