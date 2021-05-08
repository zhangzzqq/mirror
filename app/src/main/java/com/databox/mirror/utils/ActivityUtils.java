package com.databox.mirror.utils;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static com.google.gson.internal.$Gson$Preconditions.checkNotNull;

/**
 * Created by steven on 2017/4/20.
 */
public class ActivityUtils {
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }

    public static int getOrientation(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
