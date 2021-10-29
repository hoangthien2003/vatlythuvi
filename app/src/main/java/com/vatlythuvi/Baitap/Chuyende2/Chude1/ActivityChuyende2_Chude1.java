package com.vatlythuvi.Baitap.Chuyende2.Chude1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;

public class ActivityChuyende2_Chude1 extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende2_chude1);

        button1 = findViewById(R.id.buttoncd2_chude1_dang1);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2_Chude1.this,
                    ActivityChuyende2_Chude1_Dang1.class);
            startActivity(intent);
        });
    }
}