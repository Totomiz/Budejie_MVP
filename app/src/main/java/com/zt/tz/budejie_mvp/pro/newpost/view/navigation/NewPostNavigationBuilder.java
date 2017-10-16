package com.zt.tz.budejie_mvp.pro.newpost.view.navigation;

import android.content.Context;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.navigation.NavigationBuilderAdapter;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class NewPostNavigationBuilder extends NavigationBuilderAdapter {


    public NewPostNavigationBuilder(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.toolbar_newpost_layout;
    }
}
