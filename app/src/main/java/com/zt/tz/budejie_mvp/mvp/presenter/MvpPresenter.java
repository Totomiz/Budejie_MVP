package com.zt.tz.budejie_mvp.mvp.presenter;

import com.zt.tz.budejie_mvp.mvp.view.IMvpView;

/**
 * Created by zhangtong on 2016-06-16 22:37
 * QQ:xxxxxxxx
 */
public interface MvpPresenter<V extends IMvpView> {
    //绑定找房子的人（说白了就是我）
    public void attachView(V view);
    //解除绑定（说白了就是不喝我联系了）
    public void detachView();
}
