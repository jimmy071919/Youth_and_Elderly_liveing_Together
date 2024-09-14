package com.example.youth_and_elderly_liveing_together_new;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AskMedical extends AppCompatActivity {

    Button iwantcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iwantcall = findViewById(R.id.iwantcall);

        iwantcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AskMedical.this, CallDoctor.class);
                startActivity(intent);
            }
        });
    }
}