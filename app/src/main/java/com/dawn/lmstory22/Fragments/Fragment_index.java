package com.dawn.lmstory22.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dawn.lmstory22.R;

/**
 * Created by liming on 2016/12/6.
 */
public class Fragment_index extends Fragment{

    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_indexfragment, container,false);

        rv = (RecyclerView) view.findViewById(R.id.rv_index);


        return view;
    }
}
