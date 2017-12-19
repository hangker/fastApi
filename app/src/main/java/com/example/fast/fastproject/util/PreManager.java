package com.example.fast.fastproject.util;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * @desc 本地轻量级存储
 * @author：ahang
 * @time 2017/11/13 11:41
 * @company 富统
 */
public class PreManager {

    private static PreManager mInstance;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;
    private PreManager(){
    };
    public static PreManager instance(){
        if (mInstance==null){
            mInstance =new PreManager();
        }
        return mInstance;
    }
    public void init(Context context){
        mPreferences=
                context.getSharedPreferences("AcountConfig", Context.MODE_APPEND);
        if (mPreferences!=null){
            mEditor=mPreferences.edit();
            mEditor.apply();
        }
    }
    //***********************  bool  *************************
    public void saveBool(String key, boolean bool){
        if (mEditor!=null){
            mEditor.putBoolean(key,bool);
            mEditor.commit();
        }
    }
    public boolean getBool(String key){
        if (mPreferences!=null){
            return mPreferences.getBoolean(key,false);
        }
        return false;
    }
    //***********************  string *************************
    public void saveString(String key, String value){
        if (mEditor!=null){
            mEditor.putString(key,value);
            mEditor.commit();
        }
    }
    public String getString(String key){
        if (mPreferences!=null){
            return mPreferences.getString(key,"");
        }
        return "";
    }
    public void remove(String key){
        mEditor.remove(key);
        mEditor.commit();
    }
}
