package com.databox.mirror.utils;


import com.databox.mirror.common.Constant;
import com.orhanobut.logger.Logger;

import com.orhanobut.logger.Logger;

public class JLog {

    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int ASSERT = 7;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;



    public static void log(int priority, String tag, String message, Throwable throwable) {
        if (Constant.IS_DEBUG) {
            Logger.log(priority, tag, message, throwable);
        }
    }

    public static void d(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.d(message, args);
        }
    }

    public static void d(Object object) {
        if (Constant.IS_DEBUG) {
            Logger.d(object);
        }
    }

    public static void e(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.e(null, message, args);
        }
    }

    public static void e(Throwable throwable, String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.e(throwable, message, args);
        }
    }

    public static void i(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.i(message, args);
        }
    }

    public static void v(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.v(message, args);
        }
    }

    public static void w(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.w(message, args);
        }
    }

    public static void wtf(String message, Object... args) {
        if (Constant.IS_DEBUG) {
            Logger.wtf(message, args);
        }
    }

    /**
     * Formats the json content and print it
     *
     * @param json the json content
     */
    public static void json(String json) {
        if (Constant.IS_DEBUG) {
            Logger.json(json);
        }
    }

    /**
     * Formats the json content and print it
     *
     * @param xml the xml content
     */
    public static void xml(String xml) {
        if (Constant.IS_DEBUG) {
            Logger.xml(xml);
        }
    }

}
