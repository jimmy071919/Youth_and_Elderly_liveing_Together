package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MissionDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.missondetail);

        ImageView dailyHome = findViewById(R.id.dailyhome);
        dailyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MissionDetailActivity.this, DailyActivity.class);
                startActivity(intent);
            }
        });
    }
}
