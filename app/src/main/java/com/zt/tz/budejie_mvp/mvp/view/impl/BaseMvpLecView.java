package com.zt.tz.budejie_mvp.mvp.view.impl;

/**
 * Created by zhangtong on 2016-06-19 15:56
 * QQ:xxxxxxxx
 */
public abstract class BaseMvpLecView<M> implements MvpLceView<M> {
    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showError(Exception e, boolean pullToRefresh) {

    }

    @Override
    public void showData(M data) {

    }
}
