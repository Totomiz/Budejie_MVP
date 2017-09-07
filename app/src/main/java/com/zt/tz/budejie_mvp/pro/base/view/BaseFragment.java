package com.zt.tz.budejie_mvp.pro.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.mvp.presenter.impl.MvpBasePresenter;
import com.zt.tz.budejie_mvp.mvp.view.impl.MvpFragment;

/**
 * Created by zhangtong on 2016-06-19 16:38
 * QQ:xxxxxxxx
 */
public abstract class BaseFragment<P extends MvpBasePresenter> extends MvpFragment<P>{
    //我们自己的fragment需要缓存视图
    private View viewContent;//缓存视图

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(viewContent==null){
            viewContent=inflater.inflate(getContentView(),container,false);
            initContentView(viewContent);
        }
        //判断Fragment对应的Activity是否存在对应的视图
        ViewGroup parent= (ViewGroup) viewContent.getParent();
        if(parent!=null){
            //如果存在，那么就干掉，重新添加，这样的方式我们就可以缓存视图
            parent.removeView(viewContent);
        }
        return viewContent;
    }

    @Override
    public P bindPresenter() {
        return null;
    }

    public abstract int getContentView();

    public abstract void initContentView(View viewContent);

}
