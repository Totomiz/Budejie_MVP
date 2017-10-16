package com.zt.tz.budejie_mvp.pro.base.view.navigation;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 * 构建Toolbar--builder设计模式
 */

public interface NavigationBuilder {
    public NavigationBuilder setTitle(String title);
    public NavigationBuilder setTitle(int title);
    public NavigationBuilder setTileIcon(int resId);
    public NavigationBuilder setLeftIcon(int resId);
    public NavigationBuilder setRightIcon(int resId);
    public NavigationBuilder setLeftIconOnClickListener(View.OnClickListener listener);
    public NavigationBuilder setRightIconOnClickListener(View.OnClickListener listener);
    public NavigationBuilder createAndBind(ViewGroup root);
}
