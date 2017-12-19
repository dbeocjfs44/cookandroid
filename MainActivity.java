package com.example.dbeoc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.dbeoc.myapplication.databinding.ActivityMainBinding;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {

    RecyclerViewMain recyclerViewMain = new RecyclerViewMain();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        binding.setUser(user);

        binding.btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {    //다음맵 길찾기
                String url = "daummaps://route?sp=" + 37.272036 + "," + 127.128772 + "&ep=" + 37.741394 + "," + 128.871013 + "&by=CAR";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        binding.btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().addToBackStack("").replace(R.id.mainfram,recyclerViewMain).commit();
            }
        });

        binding.btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dmap.class );
                startActivity(intent);
            }
        });

        //키해시 알아내기
        /*try {
            PackageInfo info = getPackageManager().getPackageInfo("com.example.dbeoc.myapplication", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }*/
    }

    }

