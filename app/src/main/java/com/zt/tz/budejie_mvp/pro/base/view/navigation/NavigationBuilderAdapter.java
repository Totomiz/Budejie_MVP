package com.zt.tz.budejie_mvp.pro.base.view.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public abstract class NavigationBuilderAdapter implements NavigationBuilder{
    private Context context;
    private String title;
    private int titleIconRes;
    private int leftIconRes;
    private int rightIconRes;

    private View.OnClickListener leftClickListener;
    private View.OnClickListener rightClickListener;

    public NavigationBuilderAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public NavigationBuilder setTitle(String title) {
        this.title=title;
        return this;
    }

    @Override
    public NavigationBuilder setTileIcon(int resId) {
        this.titleIconRes=resId;
        return this;
    }

    @Override
    public NavigationBuilder setTitle(int title) {
        this.title=context.getResources().getString(title);
        return this;
    }

    @Override
    public NavigationBuilder setLeftIcon(int resId) {
        this.leftIconRes=resId;
        return this;
    }

    @Override
    public NavigationBuilder setRightIcon(int resId) {
        this.rightIconRes=resId;
        return this;
    }

    @Override
    public NavigationBuilder setLeftIconOnClickListener(View.OnClickListener listener) {
        this.leftClickListener=listener;
        return this;
    }

    @Override
    public NavigationBuilder setRightIconOnClickListener(View.OnClickListener listener) {
        this.rightClickListener=listener;
        return this;
    }

    @Override
    public NavigationBuilder createAndBind(ViewGroup root) {
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), root, false);
        ViewGroup viewGroup = (ViewGroup)inflate.getParent();
        if (viewGroup != null){
            viewGroup.removeView(inflate);
        }
        root.addView(inflate,0);
        return this;
    }

    /**创建自定义ToolBar布局
     * @return 自定义布局id
     */
    public abstract int getLayoutId();
}
