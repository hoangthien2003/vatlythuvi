package com.vatlythuvi.Baitap.Chuyende2.Chude7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;

public class ActivityChuyende2_Chude7 extends AppCompatActivity {
    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende2_chude7);

        button1 = findViewById(R.id.buttoncd2_chude7_dang1);
        button2 = findViewById(R.id.buttoncd2_chude7_dang2);
        button3 = findViewById(R.id.buttoncd2_chude7_dang3);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende2_Chude7_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende2_Chude7_Dang2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende2_Chude7_Dang3.class);
            startActivity(intent);
        });
    }
}