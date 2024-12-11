package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class RequestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request);

        ImageView helpHome = findViewById(R.id.helphome);
        helpHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestActivity.this, UploadMissionActivity.class);
                startActivity(intent);
            }
        });
    }
}
