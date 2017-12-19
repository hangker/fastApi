package com.example.fast.fastproject.base.act;

import android.os.Bundle;
import android.util.Log;

import com.example.fast.fastproject.mvp.BaseView;
import com.example.fast.fastproject.mvp.CommonPresenter;
import com.example.fast.fastproject.mvp.ViewsBuilder;

/**
 * @desc BaseNetActivity
 * @author：ahang
 * @time 2017/12/19 16:45
 * @company 富统
 */
public abstract class BaseNetActivity extends BaseActivity implements BaseView {

    protected CommonPresenter mCommonPresenter;
    protected ViewsBuilder mBuilder;
    /**
     * 是否需要加载loading  默认需要加载  注意：需要放在请求前设置
     */
    protected boolean isUseLoading = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initMvpViewsBuilder();
        injectViews();
    }

    protected void injectViews() {
        if (mCommonPresenter == null) {
            if (mBuilder != null) {
                mCommonPresenter = mBuilder.build();
            }
        }
    }

    protected void initMvpViewsBuilder() {
        if (mBuilder == null) {
            mBuilder = new ViewsBuilder()
                    .setBaseView(this);
            convertBuilder(mBuilder);
        }
    }

    protected abstract void convertBuilder(ViewsBuilder builder);

    @Override
    public void toShowLoading() {
        if (isUseLoading) {
            showLoading();
        }
    }

    @Override
    public void toHiddenLoading() {
        if (isUseLoading) {
            hiddenLoading();
        }
    }

    @Override
    public void requestFail(Throwable e) {
        Log.e("api", e.toString());
        showAlertWithMsg("服务器异常，请稍后再试");
    }

    @Override
    public void requestFailMsg(String msg) {
        showAlertWithMsg(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mCommonPresenter.unSubscribe();
    }
}
