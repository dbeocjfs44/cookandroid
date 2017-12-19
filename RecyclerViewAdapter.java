package com.example.dbeoc.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.dbeoc.myapplication.databinding.RecyclerviewItemBinding;

import java.util.ArrayList;

/**
 * Created by dbeoc on 2017-12-15.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<List> arrayList;

    public RecyclerViewAdapter(ArrayList<List> recyclerArrayList){
        this.arrayList = recyclerArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //RecyclerView 안에 들어가는 item 들의 layout을 연결
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyclerviewItemBinding binding = RecyclerviewItemBinding.inflate(layoutInflater, parent, false);

        return new RecyclerViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        List list = arrayList.get(position);
        holder.bind(list);
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }
}
