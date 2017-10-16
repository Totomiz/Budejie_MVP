package com.zt.tz.budejie_mvp.pro.newpost;

import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;
import com.zt.tz.budejie_mvp.pro.newpost.view.navigation.NewPostNavigationBuilder;

/**
 * Created by zhangtong on 2016-06-19 17:33
 * QQ:xxxxxxxx
 */
public class NewpostFragment extends BaseFragment {
    @Override
    public int getContentView() {
        return R.layout.fragment_newpost;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolBar(viewContent);
    }

    private void initToolBar(View viewContent) {
        NewPostNavigationBuilder builder=new NewPostNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup) viewContent);
    }

}
