package com.dawn.lmstory22.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dawn.lmstory22.R;
import com.dawn.lmstory22.enity.class_story;

import java.util.List;

/**
 * Created by liming on 2016/12/6.
 */
public class AD_RecycleView extends RecyclerView.Adapter<AD_RecycleView.MyViewHolder>{
    private Context context;
    private List<class_story> data;


    public AD_RecycleView(Context context, List<class_story> data) {
        this.context = context;
        this.data = data;
    }

    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(context).inflate(R.layout.layout_storyitem,parent,false);

        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        class_story storyitem=data.get(position);
        holder.nickname.setText(storyitem.getNickname());
        holder.city.setText(storyitem.getCity());
        holder.info.setText(storyitem.getInfo());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nickname;
        TextView date;
        TextView city;
        TextView info;
        TextView comment;

        public MyViewHolder(View itemView) {
            super(itemView);
            nickname= (TextView) itemView.findViewById(R.id.nickname_story);
            date= (TextView) itemView.findViewById(R.id.date_story);
            city= (TextView) itemView.findViewById(R.id.city_story);
            info= (TextView) itemView.findViewById(R.id.info_story);
            comment= (TextView) itemView.findViewById(R.id.comment_story);

        }
    }
}
