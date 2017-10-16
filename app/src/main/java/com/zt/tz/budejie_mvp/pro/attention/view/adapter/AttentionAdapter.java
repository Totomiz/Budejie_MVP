package com.zt.tz.budejie_mvp.pro.attention.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.zt.tz.budejie_mvp.pro.essense.EssenceVideoFragment;

import java.util.List;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class AttentionAdapter extends FragmentStatePagerAdapter{
    public static final String SPLIT_STRING = "@tony@";
    //用于获取专栏子栏目数据,暂由本地String类型替代
    private List<String> mDataList;

    public AttentionAdapter(FragmentManager fm, List<String> datas) {
        super(fm);
        this.mDataList=datas;

    }

    @Override
    public Fragment getItem(int position) {
        //根据data条目创建一个子专栏
        EssenceVideoFragment fragment=new EssenceVideoFragment();
        String[] data=mDataList.get(position).split(SPLIT_STRING);
        fragment.setType(Integer.parseInt(data[1]));
        fragment.setTitle(data[0]);
        return fragment;
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mDataList.get(position).split(SPLIT_STRING)[0];
    }
}
