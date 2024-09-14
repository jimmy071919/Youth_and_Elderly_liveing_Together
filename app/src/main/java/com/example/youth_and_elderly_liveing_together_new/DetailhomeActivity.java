package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DetailhomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homedetail);

        ImageButton BackHome = findViewById(R.id.backhomebutton);

        BackHome.setOnClickListener(v -> {
            Intent intent = new Intent(DetailhomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

    }
}
