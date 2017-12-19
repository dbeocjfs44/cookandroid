package com.example.dbeoc.myapplication;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.dbeoc.myapplication.databinding.RecyclerviewItemBinding;

/**
 * Created by dbeoc on 2017-12-15.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private final RecyclerviewItemBinding itemBinding;
    public ImageView testimageview;

    public RecyclerViewHolder(RecyclerviewItemBinding binding) {
        super(binding.getRoot());
        this.itemBinding = binding;
    }

    public void bind(List list) {
        itemBinding.setList(list);
        itemBinding.executePendingBindings();
    }
}
