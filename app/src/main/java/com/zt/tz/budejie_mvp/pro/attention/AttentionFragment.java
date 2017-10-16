package com.zt.tz.budejie_mvp.pro.attention;

import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.attention.view.navigation.AttentionNavigationBuilder;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;

/**
 * Created by zhangtong on 2016-06-19 17:34
 * QQ:xxxxxxxx
 */
public class AttentionFragment extends BaseFragment {
    @Override
    public int getContentView() {
        return R.layout.fragment_attention;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolBar(viewContent);
    }

    private void initToolBar(View viewContent) {
        AttentionNavigationBuilder builder=new AttentionNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup)viewContent);
    }


}
