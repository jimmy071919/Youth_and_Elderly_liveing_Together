package com.example.youth_and_elderly_liveing_together_new;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class ButtonClickListener implements View.OnClickListener {
    private Context context;

    public ButtonClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, AskMedical.class);
        context.startActivity(intent);
    }
}
