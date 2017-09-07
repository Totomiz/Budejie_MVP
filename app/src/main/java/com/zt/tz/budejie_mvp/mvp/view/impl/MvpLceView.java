package com.zt.tz.budejie_mvp.mvp.view.impl;

import com.zt.tz.budejie_mvp.mvp.view.IMvpView;

/**
 * 请求数据，刷新UI界面监听（标准）说白了就是我们经常看到的loading页
 * Created by zhangtong on 2016-06-16 22:48
 * QQ:xxxxxxxx
 */
public interface MvpLceView<M> extends IMvpView{
    //下拉刷新
    public void showLoading(boolean pullToRefresh);
    //显示内容
    public void showContent();
    //显示错误信息
    public void showError(Exception e,boolean pullToRefresh);
    //绑定数据
    public void showData(M data);
}
