package com.zt.tz.budejie_mvp.pro.essense.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zt.tz.budejie_mvp.R;
import com.zt.tz.budejie_mvp.bean.IBean;
import com.zt.tz.budejie_mvp.bean.PositionBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony.zhang
 * Email: tony.zhang.Mr@foxmail.com
 */

public class EssenceVideoAdapter extends RecyclerView.Adapter<EssenceVideoAdapter.EssenceVideoHolder> {
    private List<IBean> list=new ArrayList<>();
    private Context context;

    private void defaultBean(){
        for (int i = 0; i < 10; i++) {
            list.add(new PositionBean());
        }
    }

    public EssenceVideoAdapter(List<IBean> list, Context context) {
        if(list!=null){
            this.list = list;
        }else{
            defaultBean();
        }
        this.context = context;

    }

    @Override
    public EssenceVideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_essence_video_layout, parent, false);
        EssenceVideoHolder holder=new EssenceVideoHolder(inflate);
        return holder;
    }

    @Override
    public void onBindViewHolder(EssenceVideoHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class EssenceVideoHolder extends RecyclerView.ViewHolder{
        public ImageView iv_photo;
        public TextView tv_name;
        public TextView tv_time;
        public TextView tv_content;
        public ImageView iv_video;



        public EssenceVideoHolder(View itemView) {
            super(itemView);
        }
    }
}
