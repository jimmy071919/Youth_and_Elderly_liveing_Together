package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IndexActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button loginButton;
    private Button forgotPwButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index); // 設置佈局為 index.xml

        // 初始化視圖
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        forgotPwButton = findViewById(R.id.forgotpw_button);
        signUpButton = findViewById(R.id.sign_up);

        // 設置按鈕點擊事件
        loginButton.setOnClickListener(v -> {
            // 執行登入操作
            Toast.makeText(IndexActivity.this, "登入按鈕被點擊", Toast.LENGTH_SHORT).show();
        });

        forgotPwButton.setOnClickListener(v -> {
            // 執行忘記密碼操作
            Toast.makeText(IndexActivity.this, "忘記密碼按鈕被點擊", Toast.LENGTH_SHORT).show();
        });

        signUpButton.setOnClickListener(v -> {
            // 執行註冊操作
            Toast.makeText(IndexActivity.this, "註冊按鈕被點擊", Toast.LENGTH_SHORT).show();
        });
    }
}
