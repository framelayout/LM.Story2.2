package com.dawn.lmstory22.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dawn.lmstory22.Bean.GetStory;
import com.dawn.lmstory22.R;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class AD_IndexLv extends BaseAdapter{
    private List<GetStory.DataBean> getStories;
    private Context context;

    public AD_IndexLv(List<GetStory.DataBean> getStories, Context context) {
        this.getStories = getStories;
        this.context = context;
    }

    @Override
    public int getCount() {
        return getStories.size();
    }

    @Override
    public Object getItem(int position) {
        return getStories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh=null;
        if (convertView==null)
        {
            vh=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.layout_storyitem,parent,false);

            vh.tv= (TextView) convertView.findViewById(R.id.info_story);
            convertView.setTag(vh);
        }
        else
        {
            vh= (ViewHolder) convertView.getTag();
        }

        GetStory.DataBean bean=getStories.get(position);

        vh.tv.setText(bean.getStory_info());


        return convertView;
    }

    class ViewHolder{
        TextView tv;
    }
}
