package com.example.fast.fastproject.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fast.fastproject.R;


/**
 * @desc 全局导航栏
 * @author：ahang
 * @time 2017/11/13 11:41
 * @company 富统
 */
public class AppTitleBar extends RelativeLayout {
    private TextView mBack;
    private TextView mTitle;
    private TextView mAction;
    private TextView mAction1;
    private TextView mState;
    private ImageView mRed;  //小红点
    private static final int DEFAULT_TITLE_COLOR = Color.BLACK;
    private View view2;

    public AppTitleBar(Context context) {
        super(context);
        init(context, null);
    }
    public AppTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }
    public AppTitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs);
    }
    private void init(Context context, AttributeSet attr) {
        LayoutInflater.from(context).inflate(R.layout.app_title_bar, this);
        mBack = (TextView) findViewById(R.id.app_title_back);
        mTitle = (TextView) findViewById(R.id.app_title_text);
        mAction = (TextView) findViewById(R.id.app_title_action);
        mState = (TextView) findViewById(R.id.state_bar);
        TypedArray array = context.obtainStyledAttributes(attr, R.styleable.AppTitleBar);
        if (array != null) {
            Drawable background = array.getDrawable(R.styleable.AppTitleBar_bar_background);
            if (background != null) {
                this.setBackgroundDrawable(background);
            }
            String title = array.getString(R.styleable.AppTitleBar_bar_title);
            int color = array.getColor(R.styleable.AppTitleBar_bar_title_text_color, DEFAULT_TITLE_COLOR);
            if (!TextUtils.isEmpty(title)) {
                mTitle.setText(title);
                mTitle.setTextColor(color);
            }
        } else {
            this.setBackgroundColor(this.getResources().getColor(R.color.white));
        }
        setTextAndImg(array, mBack, R.styleable.AppTitleBar_back_text, R.styleable.AppTitleBar_back_img);
        setTextAndImg(array, mAction, R.styleable.AppTitleBar_action_text, R.styleable.AppTitleBar_action_img);
        setTextAndImg(array, mAction1, R.styleable.AppTitleBar_action_text, R.styleable.AppTitleBar_action_img);
        if (array != null) {
            array.recycle();
        }
    }
    private void setTextAndImg(TypedArray array, TextView textView, int textId, int imgId) {
        if (array != null) {
            Drawable drawable = array.getDrawable(imgId);
            String backText = array.getString(textId);
            if (!TextUtils.isEmpty(backText)) {
                textView.setText(backText);
            }
            setDrawable(drawable, textView);
        } else {
            Drawable drawable = getResources().getDrawable(R.drawable.nomal_selector);
            setDrawable(drawable, textView);
        }
    }

    private void setDrawable(Drawable drawable, TextView textView) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth());
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }
    public TextView getState() {
        return mState;
    }
    public void setState(TextView state) {
        mState = state;
    }
    public TextView getAction1() {
        return mAction1;
    }
    public void setAction1(TextView action1) {
        mAction1 = action1;
    }
    public TextView getAction() {
        return mAction;
    }


    public void setVisible(View driver){
        view2 = driver;
    }
    public View getVisible() {
        return view2;

    }

    public TextView getBack() {
        return mBack;
    }
    public TextView getTitle() {
        return mTitle;
    }
    public void setTitle(String text) {
        mTitle.setText(text);
    }
    public void setTitle(int text) {
        mTitle.setText(text);
    }
    public ImageView getRedDian(){
        return mRed;
    }
}
