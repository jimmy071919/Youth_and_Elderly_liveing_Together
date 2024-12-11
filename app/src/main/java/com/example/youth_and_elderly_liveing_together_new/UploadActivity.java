package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class UploadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);

        Button saveUploadButton = findViewById(R.id.saveuploadbutton);
        saveUploadButton.setOnClickListener(v -> {
            Intent intent = new Intent(UploadActivity.this, UploadHomeActivity.class);
            startActivity(intent);
        });
    }
}
