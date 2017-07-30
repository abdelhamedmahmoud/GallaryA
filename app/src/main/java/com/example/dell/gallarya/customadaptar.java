package com.example.dell.gallarya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Dell on 4/5/2017.
 */

public class customadaptar extends BaseAdapter {

    Context c;
    ArrayList<data> datas;
    public customadaptar( Context c,ArrayList<data> datas){

        this.c=c;
        this.datas=datas;

    }


    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null){

            view = LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);

        }
        final data d =(data) this.getItem(i);

        ImageView img=(ImageView)view.findViewById(R.id.imageView5);

        Picasso.with(c).load(d.getUri()).placeholder(R.drawable.splashscreen).into(img);



        return view;
    }
}
