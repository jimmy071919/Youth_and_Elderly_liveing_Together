package com.example.youth_and_elderly_liveing_together_new;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText password;
    private EditText check_password;
    private Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.reset_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void findViews() {
        // 初始化实例变量
        password = findViewById(R.id.edit_new_password);
        check_password = findViewById(R.id.check_new_password);
        confirm = findViewById(R.id.confirm);
    }

    public void confirm(View view) {
        String passwordText = password.getText().toString();
        String checkPasswordText = check_password.getText().toString();

        if (passwordText.equals(checkPasswordText)) {
            password.setError(null);
            check_password.setError(null);
            Toast.makeText(this, "修改成功", Toast.LENGTH_SHORT).show();
        } else {
            password.setError("密碼不相同");
            check_password.setError("密碼不相同");
            Toast.makeText(this, "密碼不相同", Toast.LENGTH_SHORT).show();
        }
    }


}
