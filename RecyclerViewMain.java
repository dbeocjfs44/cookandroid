package com.example.dbeoc.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dbeoc.myapplication.databinding.RecyclerviewMainBinding;

import java.util.ArrayList;

/**
 * Created by dbeoc on 2017-12-15.
 */

public class RecyclerViewMain extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter listAdapter;
    public static int[] covers = {R.drawable.ex2,R.drawable.ex3,R.drawable.ex4,R.drawable.ex5, R.drawable.ex6, R.drawable.ex7};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<List> test = new ArrayList<List>();

        for (int i=0; i<covers.length; i++)
        {
            if (i < 5 )
                test.add(new List(ContextCompat.getDrawable(getContext(),covers[i])));
        }
        //test.add(new List(ContextCompat.getDrawable(getContext(), R.drawable.ex2)));
        //test.add(new List(R.drawable.ex));

        listAdapter = new RecyclerViewAdapter(test);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RecyclerviewMainBinding binding = RecyclerviewMainBinding.inflate(inflater, container, false);

        //리사이클뷰 생성
        recyclerView = binding.mainRecyclerView;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(listAdapter);

        View v = binding.getRoot();
        return v;
    }

}
