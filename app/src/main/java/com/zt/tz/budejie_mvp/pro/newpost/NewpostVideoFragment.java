package com.zt.tz.budejie_mvp.pro.newpost;

import android.view.View;
import android.widget.TextView;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class NewpostVideoFragment extends BaseFragment{
    //用于标识每个title的类型，（比如有的是视屏列，有的是图片列，这个甚至可以由服务器去标识）
    private int mType;
    private String mTitle;

    public void setType(int mType) {
        this.mType = mType;
    }

    public void setTitle(String title){
        this.mTitle = title;
    }

    @Override
    public int getContentView() {
        return R.layout.fragment_essence_video;
    }

    @Override
    public void initContentView(View viewContent) {
        TextView textView = (TextView) viewContent.findViewById(R.id.tv_content);
        textView.setText(mTitle);
    }

}
