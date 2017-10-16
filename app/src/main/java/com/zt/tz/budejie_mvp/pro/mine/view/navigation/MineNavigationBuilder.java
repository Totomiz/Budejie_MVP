package com.zt.tz.budejie_mvp.pro.mine.view.navigation;

import android.content.Context;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.navigation.NavigationBuilderAdapter;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class MineNavigationBuilder extends NavigationBuilderAdapter {


    public MineNavigationBuilder(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.toolbar_mine_layout;
    }
}
