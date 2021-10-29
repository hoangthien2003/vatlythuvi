package com.vatlythuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageButton button=findViewById(R.id.btn_start);
        button.setOnClickListener(v -> {
            Intent a = new Intent(getApplicationContext(), IntroActivity.class);
            startActivity(a);
        });
    }
}