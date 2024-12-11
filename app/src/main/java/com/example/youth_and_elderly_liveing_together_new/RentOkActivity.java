package com.example.youth_and_elderly_liveing_together_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RentOkActivity extends AppCompatActivity {
    private Button startLivingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rentok);

        startLivingButton = findViewById(R.id.startlivingbutton);
        startLivingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentOkActivity.this, UploadHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
