package com.zt.tz.budejie_mvp.pro.essense;

import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;
import com.zt.tz.budejie_mvp.pro.essense.view.navigation.EssenceNavigationBuilder;

/**
 * Created by zhangtong on 2016-06-19 17:28
 * QQ:xxxxxxxx
 */
public class EssenceFragment extends BaseFragment {
    @Override
    public int getContentView() {
        return R.layout.fragment_essence;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolBar(viewContent);
    }

    private void initToolBar(View viewContent) {
        EssenceNavigationBuilder builder=new EssenceNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup) viewContent);
    }


}
