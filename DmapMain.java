package com.example.dbeoc.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dbeoc.myapplication.databinding.DmapMainBinding;

import net.daum.mf.map.api.MapView;

/**
 * Created by dbeoc on 2017-12-18.
 */

public class DmapMain extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DmapMainBinding binding = DataBindingUtil.setContentView(this, R.layout.dmap_main);

        MapView mapView = new MapView(this);
        binding.dampMain.addView(mapView);
    }
}
