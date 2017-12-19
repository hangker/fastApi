package com.example.fast.fastproject.mvp;
/**
 * @desc 父类view层
 * @author：ahang
 * @time 2017/11/13 11:41
 * @company 富统
 */
public interface BaseView {

    void toShowLoading();

    void toHiddenLoading();

    void requestFail(Throwable e);

    void requestFailMsg(String msg);

}
