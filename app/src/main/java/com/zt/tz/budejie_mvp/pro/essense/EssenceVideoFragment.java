package com.zt.tz.budejie_mvp.pro.essense;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;
import com.zt.tz.budejie_mvp.pro.essense.view.adapter.EssenceVideoAdapter;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class EssenceVideoFragment extends BaseFragment {
    //用于标识每个title的类型，（比如有的是视屏列，有的是图片列，这个甚至可以由服务器去标识）
    private int mType;
    private String mTitle;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout refreshLayout;

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
        recyclerView= (RecyclerView) viewContent.findViewById(R.id.recycler_view_test_rv);
    }


    @Override
    public void initData() {
        EssenceVideoAdapter adapter=new EssenceVideoAdapter(null,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }
}
