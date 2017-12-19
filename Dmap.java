package com.example.dbeoc.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.dbeoc.myapplication.databinding.ActivityDmapBinding;

import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

/**
 * Created by dbeoc on 2017-12-18.
 */

public class Dmap extends AppCompatActivity implements MapView.MapViewEventListener{

    ActivityDmapBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dmap);

        MapView mapView = new MapView(this);
        mapView.setMapViewEventListener(this);
        binding.dampLayout.addView(mapView);

       // mapView.setMapViewEventListener((MapViewEventListener));

    }

    @Override
    public void onMapViewInitialized(MapView mapView) {

    }

    @Override
    public void onMapViewCenterPointMoved(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewZoomLevelChanged(MapView mapView, int i) {

    }

    @Override
    public void onMapViewSingleTapped(MapView mapView, MapPoint mapPoint) {
        //mapView.removeAllCircles();
        binding.dampLayout.removeAllViews();    //다음맵 정책에 따라 두개의 MapView 사용이 금지.
        Intent intent = new Intent(this, DmapMain.class);
        startActivity(intent);
    }

    @Override
    public void onMapViewDoubleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewLongPressed(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragStarted(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragEnded(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewMoveFinished(MapView mapView, MapPoint mapPoint) {

    }
}
