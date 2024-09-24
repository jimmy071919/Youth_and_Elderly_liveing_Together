package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RenthomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rentok);

        Button BackHome = findViewById(R.id.startlivingbutton);

        BackHome.setOnClickListener(v -> {
            Intent intent = new Intent(RenthomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

    }
}
