package com.zt.tz.budejie_mvp.pro.mine;

import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;
import com.zt.tz.budejie_mvp.pro.mine.view.navigation.MineNavigationBuilder;

/**
 * Created by zhangtong on 2016-06-19 17:35
 * QQ:xxxxxxxx
 */
public class MineFragment extends BaseFragment {
    @Override
    public int getContentView() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initContentView(View viewContent) {
        initTooBar(viewContent);
    }

    private void initTooBar(View viewContent) {
        MineNavigationBuilder builder=new MineNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup) viewContent);
    }

}
