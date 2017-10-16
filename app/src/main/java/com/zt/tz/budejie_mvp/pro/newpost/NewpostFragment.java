package com.zt.tz.budejie_mvp.pro.newpost;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.pro.base.view.BaseFragment;
import com.zt.tz.budejie_mvp.pro.essense.view.adapter.EssenceAdapter;
import com.zt.tz.budejie_mvp.pro.newpost.view.navigation.NewPostNavigationBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangtong on 2016-06-19 17:33
 * QQ:xxxxxxxx
 */
public class NewpostFragment extends BaseFragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    public int getContentView() {
        return R.layout.fragment_newpost;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolBar(viewContent);
        mTabLayout = (TabLayout) viewContent.findViewById(R.id.tab_essence);
        mViewPager= (ViewPager) viewContent.findViewById(R.id.vp_essence);
    }

    private void initToolBar(View viewContent) {
        NewPostNavigationBuilder builder=new NewPostNavigationBuilder(getContext());
        builder.createAndBind((ViewGroup) viewContent);
    }

    @Override
    public void initData() {
        //获取StringArrs
        String[] stringArray = getResources().getStringArray(R.array.newpost_video_tab);
        List<String> list= Arrays.asList(stringArray);
        EssenceAdapter adapter=new EssenceAdapter(getFragmentManager(),list);

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
