package com.zt.tz.budejie_mvp.pro.attention.view.navigation;

import android.content.Context;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.navigation.NavigationBuilderAdapter;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class AttentionNavigationBuilder extends NavigationBuilderAdapter {


    public AttentionNavigationBuilder(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.toolbar_attention_layout;
    }
}
