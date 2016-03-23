package com.nickdnepr.firstmission.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by ADMIN on 12.03.2016.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> { //[Comment] Your Adapter?
    private ArrayList<String> list; //[Comment] Wrong names
    private Context context;

    public MyRecyclerViewAdapter(ArrayList<String> list, Context context) { //[Comment] Your ViewHolder? It should be ViewHolder
        this.list = list;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView photo; //[Comment] Wrong visibility modifier,

        public MyViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.photo);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_for_recycler_view, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder; //[Comment] return new ViewHolder(v)
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
//        viewHolder.photo.setImageResource(list.get(i));
        ImageView imageView = viewHolder.photo; //[Comment] Unused object
//        imageView.setImageResource(R.drawable.pushkin1);
        Glide.with(context).load(list.get(i)).into(viewHolder.photo);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
