package com.zt.tz.budejie_mvp.mvp.view.impl;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.zt.tz.budejie_mvp.mvp.presenter.impl.MvpBasePresenter;
import com.zt.tz.budejie_mvp.mvp.view.IMvpView;

/**
 * 将我们的MVP架构集成到Activity
 * Created by zhangtong on 2016-06-19 16:23
 * QQ:xxxxxxxx
 */
public abstract class MvpActivity<P extends MvpBasePresenter> extends AppCompatActivity implements IMvpView{
    //MVP架构p是动态的
    protected P presenter;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //我的presenter中介我是不是管理view关联
        presenter=bindPresenter();
        if(presenter!=null){
            presenter.attachView(this);
        }
    }
    //具体的实现我不知道，我给别人实现
    public abstract P bindPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //销毁解除绑定
        if(presenter!=null){
            presenter.detachView();
        }
    }
}
