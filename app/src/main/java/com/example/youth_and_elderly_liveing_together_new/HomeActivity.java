package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uploadhome);

        // 获取每个 ImageView 的引用
        ImageView houseHome = findViewById(R.id.househome);
        ImageView chatHome = findViewById(R.id.chathome);
        ImageView helpHome = findViewById(R.id.helphome);
        ImageView missionHome = findViewById(R.id.dailyhome);
        ImageView profileHome = findViewById(R.id.profilehome);

        Button SeeHome = findViewById(R.id.seehomebutton);
        Button SaveHome = findViewById(R.id.savehomebutton);

        Button RentHome = findViewById(R.id.renthomebutton);


        houseHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        /*chatHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
            startActivity(intent);
        });

        helpHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HelpActivity.class);
            startActivity(intent);
        });

        missionHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, DailyActivity.class);
            startActivity(intent);
        });

        profileHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });*/

        SeeHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, DetailhomeActivity.class);
            startActivity(intent);
        });

        SaveHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, UploadHomeActivity.class);
            startActivity(intent);
        });

        RentHome.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, UploadHomeActivity.class);
            startActivity(intent);
        });

    }
}
