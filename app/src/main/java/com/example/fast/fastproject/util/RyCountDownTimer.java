package com.example.fast.fastproject.util;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * 验证码时间倒计时工具类
 * Created by rongyao on 2017/10/13.
 */

public class RyCountDownTimer extends CountDownTimer {
    private TextView mClickView;

    public RyCountDownTimer(long millisInFuture, long countDownInterval, TextView mClickView) {
        super(millisInFuture, countDownInterval);
        this.mClickView = mClickView;
    }

    public RyCountDownTimer(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    //计时过程
    @Override
    public void onTick(long l) {
        //防止计时过程中重复点击
        mClickView.setClickable(false);
        mClickView.setText(l / 1000 + "s");

    }

    //计时完毕的方法
    @Override
    public void onFinish() {
        //重新给Button设置文字
        mClickView.setText("重新获取");
        //设置可点击
        mClickView.setClickable(true);
    }
}
