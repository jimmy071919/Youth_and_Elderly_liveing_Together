package com.example.youth_and_elderly_liveing_together_new;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        RadioGroup genderGroup = findViewById(R.id.gender_group);
        EditText birthday = findViewById(R.id.birthday);
        EditText idNumber = findViewById(R.id.id_number);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        Button registerButton = findViewById(R.id.register_button);

        // 日期選擇器
        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(register.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                birthday.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePickerDialog.show();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameText = name.getText().toString();
                int selectedGenderId = genderGroup.getCheckedRadioButtonId();
                RadioButton selectedGender = findViewById(selectedGenderId);
                String genderText = selectedGender != null ? selectedGender.getText().toString() : "未選擇";
                String birthdayText = birthday.getText().toString();
                String idNumberText = idNumber.getText().toString();
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();



                Toast.makeText(register.this, "註冊成功！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
