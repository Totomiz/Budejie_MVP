package com.zt.tz.budejie_mvp.mvp.view.impl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.zt.tz.budejie_mvp.mvp.presenter.impl.MvpBasePresenter;
import com.zt.tz.budejie_mvp.mvp.view.IMvpView;

/**
 * Created by zhangtong on 2016-06-19 16:31
 * QQ:xxxxxxxx
 */
public abstract class MvpFragment<P extends MvpBasePresenter> extends Fragment implements IMvpView {
    //MVP架构p是动态的
    protected P presenter;
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter=bindPresenter();
        if(presenter!=null){
            presenter.attachView(this);
        }
    }
    //具体的实现我不知道，我给别人实现
    public abstract P bindPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //销毁解除绑定
        if(presenter!=null){
            presenter.detachView();
        }
    }
}
