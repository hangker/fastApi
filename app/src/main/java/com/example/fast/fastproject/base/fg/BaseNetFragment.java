package com.example.fast.fastproject.base.fg;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fast.fastproject.R;
import com.example.fast.fastproject.mvp.BaseView;
import com.example.fast.fastproject.mvp.CommonPresenter;
import com.example.fast.fastproject.mvp.ViewsBuilder;

/**
 * @desc BaseNetFragment
 * @author：ahang
 * @time 2017/12/19 16:45
 * @company 富统
 */
public abstract class BaseNetFragment extends BaseFragment implements BaseView {

    protected CommonPresenter mCommonPresenter;
    protected ViewsBuilder mBuilder;
    /**
     * 是否需要加载loading  默认需要加载  注意：需要放在请求前设置
     */
    protected boolean isUseLoading = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
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
        if (isUseLoading){
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
    public void onDestroy() {
        super.onDestroy();
        mCommonPresenter.unSubscribe();
    }
}
