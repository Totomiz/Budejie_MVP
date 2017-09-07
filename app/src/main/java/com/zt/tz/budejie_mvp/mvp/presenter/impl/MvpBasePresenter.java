package com.zt.tz.budejie_mvp.mvp.presenter.impl;

import com.zt.tz.budejie_mvp.mvp.presenter.MvpPresenter;
import com.zt.tz.budejie_mvp.mvp.view.IMvpView;

/**
 * Created by zhangtong on 2016-06-19 16:00
 * QQ:xxxxxxxx
 */
public class MvpBasePresenter<V extends IMvpView> implements MvpPresenter<V> {
    private V view;

    @Override
    public void attachView(V view) {
        this.view=view;
    }

    @Override
    public void detachView() {
        if(view!=null){
            view=null;
        }
    }
}
