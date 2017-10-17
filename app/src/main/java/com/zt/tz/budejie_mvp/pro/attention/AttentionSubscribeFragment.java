package com.zt.tz.budejie_mvp.pro.attention;

import android.view.View;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class AttentionSubscribeFragment extends BaseFragment {

    private int mType;
    private String mTitle;

    public void setType(int mType) {
        this.mType = mType;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public int getContentView() {
        return R.layout.fragment_attention_subscription;
    }

    @Override
    public void initContentView(View viewContent) {

    }
}
