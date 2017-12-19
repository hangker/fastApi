package com.example.fast.fastproject.base.act;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.fast.fastproject.widget.ToastLoading;


/**
 * @desc BaseActivity
 * @author：ahang
 * @time 2017/11/13 11:41
 * @company 富统
 */
public class BaseActivity extends FragmentActivity {

    private ToastLoading mAppLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        changeStateNormal();
    }

    //****************************** loading ***************************************
    public void showLoading() {
        if (mAppLoading == null) {
            mAppLoading = new ToastLoading(this);
        }
        mAppLoading.open();
    }

    public void hiddenLoading() {
        if (mAppLoading != null) {
            mAppLoading.close();
        }
    }

    protected void showAlertWithMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 沉浸式状态栏处理
     */
    private void changeStateNormal() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

}
