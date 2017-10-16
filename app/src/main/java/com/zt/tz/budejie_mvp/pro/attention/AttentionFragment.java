package com.zt.tz.budejie_mvp.pro.attention;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.attention.view.adapter.AttentionAdapter;
import com.zt.tz.budejie_mvp.pro.attention.view.navigation.AttentionNavigationBuilder;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangtong on 2016-06-19 17:34
 * QQ:xxxxxxxx
 */
public class AttentionFragment extends BaseFragment {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    public int getContentView() {
        return R.layout.fragment_attention;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolBar(viewContent);
        mViewPager= (ViewPager) viewContent.findViewById(R.id.vp_attention);
    }

    private void initToolBar(View viewContent) {
        AttentionNavigationBuilder builder=new AttentionNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup)viewContent);
        mTabLayout=builder.getTabLayout();
    }

    @Override
    public void initData() {
        String[] stringArray = getResources().getStringArray(R.array.attention_video_tab);
        List<String> list= Arrays.asList(stringArray);
        AttentionAdapter adapter=new AttentionAdapter(getFragmentManager(),list);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
