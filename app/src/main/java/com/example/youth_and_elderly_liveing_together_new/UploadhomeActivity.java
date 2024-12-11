package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UploadHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uploadhome);

        Button BackHome = findViewById(R.id.startlivingbutton);
        BackHome.setVisibility(View.GONE);

        BackHome.setOnClickListener(v -> {
            Intent intent = new Intent(UploadHomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        Button saveHomeButton = findViewById(R.id.savehomebutton);
        saveHomeButton.setOnClickListener(v -> {
            Intent intent = new Intent(UploadHomeActivity.this, UploadActivity.class);
            startActivity(intent);
        });

        ImageView chatHome = findViewById(R.id.chathome);
        chatHome.setOnClickListener(v -> {
            Intent intent = new Intent(UploadHomeActivity.this, RequestActivity.class);
            startActivity(intent);
        });
    }
}
