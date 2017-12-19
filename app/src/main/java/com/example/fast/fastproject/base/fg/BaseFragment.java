package com.example.fast.fastproject.base.fg;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.example.fast.fastproject.R;
import com.example.fast.fastproject.base.act.BaseActivity;
import com.example.fast.fastproject.widget.AppTitleBar;
import com.example.fast.fastproject.widget.ToastLoading;

/**
 * @desc BaseFragment
 * @author：ahang
 * @time 2017/11/13 11:41
 * @company 富统
 */
public class BaseFragment extends Fragment {
    private ToastLoading mAppLoading;
    protected InputMethodManager inputMethodManager;
    protected AppTitleBar mAppTitleBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inputMethodManager = (InputMethodManager) getActivity().
                getSystemService(Context.INPUT_METHOD_SERVICE);
        init(view);
    }

    /**
     * 初始化view操作
     */
    protected void init(View view) {
        /**
         * 解决页面覆盖 被覆盖页面 仍然可以点击的问题
         */
        view.setClickable(true);
        view.setBackgroundResource(R.color.fragment_bg);
        //先初始化导航栏
        mAppTitleBar = (AppTitleBar) view.findViewById(R.id.app);
        if (mAppTitleBar != null) {
            mAppTitleBar.getBack().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hideSoftKeyboard();
                    popBackStack();
                }
            });
        }
    }

    /**
     * 隐藏软键盘
     */
    protected void hideSoftKeyboard() {
        if (getActivity().getWindow().getAttributes().softInputMode !=
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN) {
            if (getActivity().getCurrentFocus() != null) {
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
                }
            }
        }
    }

    /**
     * 退出当前fragment
     */
    public void popBackStack() {
        try {
            if (isDetached() || isRemoving() || getFragmentManager() == null) {
                return;
            }
            if (isResumed()) {
                getFragmentManager().popBackStackImmediate();
            }
        } catch (Exception e) {
        }
    }


    //****************************** loading ***************************************
    public void showLoading() {
        if (mAppLoading == null) {
            mAppLoading = new ToastLoading((BaseActivity) getActivity());
        }
        mAppLoading.open();
    }

    public void hiddenLoading() {
        if (mAppLoading != null) {
            mAppLoading.close();
        }
    }

    protected void showAlertWithMsg(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
