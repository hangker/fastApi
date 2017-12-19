package com.example.fast.fastproject.util;

import android.app.Activity;
import android.os.Build;
import android.view.WindowManager;

/**
 * Created by rongyao on 2017/10/12.
 */

public class RyStatusBarUtil {

    public static void changeStateNormal(Activity mActivity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mActivity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
}
