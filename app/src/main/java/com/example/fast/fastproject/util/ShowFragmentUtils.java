//package com.example.fast.fastproject.util;
//
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
//import android.util.Log;
//
//import com.nomal.ftit.androidnomalproject.R;
//import com.nomal.ftit.androidnomalproject.base.fg.BaseFragment;
//
//import java.util.List;
//
//public class ShowFragmentUtils {
//    private ShowFragmentUtils() {
//    }
//    public static void showFragment(
//            FragmentActivity activity,
//            Class<? extends BaseFragment> who,
//            String tag,
//            Bundle arguments,
//            boolean isAddToBackStack) {
//        FragmentManager manager = activity.getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        BaseFragment fragment = null;
//        try {
//            fragment = who.newInstance();
//        } catch (Exception e) {
//            Log.e("showFragment", e.getMessage());
//        }
//        if (fragment == null) {
//            Log.e("showFragment", "fragment is Null !!!");
//            return;
//        }
//        fragment.setArguments(arguments);
//        //系统的动画
////         transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        transaction.setCustomAnimations(
//                R.anim.fragment_right_in,
//                R.anim.fragment_right_out,
//                R.anim.fragment_pop_in,
//                R.anim.fragment_pop_out);
//        transaction.add(android.R.id.content, fragment, tag);
//        if (isAddToBackStack) {
//            transaction.addToBackStack(tag);
//        }
//        transaction.commit();
//    }
//
//    public static void showFragmentNoAnimal(
//            FragmentActivity activity,
//            Class<? extends BaseFragment> who,
//            String tag,
//            Bundle arguments,
//            boolean isAddToBackStack) {
//        FragmentManager manager = activity.getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        BaseFragment fragment = null;
//        try {
//            fragment = who.newInstance();
//        } catch (Exception e) {
//            Log.e("showFragment", e.getMessage());
//        }
//        if (fragment == null) {
//            Log.e("showFragment", "fragment is Null !!!");
//            return;
//        }
//        fragment.setArguments(arguments);
//        //系统的动画
////         transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
////        transaction.setCustomAnimations(
////                R.anim.fragment_right_in,
////                R.anim.fragment_right_out,
////                R.anim.fragment_pop_in,
////                R.anim.fragment_pop_out);
//        transaction.add(android.R.id.content, fragment, tag);
//        if (isAddToBackStack) {
//            transaction.addToBackStack(tag);
//        }
//        transaction.commit();
//    }
//
//
//    public static void popBackStack(FragmentActivity activity) {
//        FragmentManager manager = activity.getSupportFragmentManager();
//        manager.popBackStack();
//    }
//    public static BaseFragment getCurrentFragment(FragmentActivity activity) {
//        FragmentManager manager = activity.getSupportFragmentManager();
//        List<Fragment> fragments = manager.getFragments();
//        int size = fragments.size();
//        BaseFragment fragment = null;
//        if (size>0){
//            int position =size-1;
//            fragment = (BaseFragment) fragments.get(position);
//        }
//        return fragment;
//    }
//}
