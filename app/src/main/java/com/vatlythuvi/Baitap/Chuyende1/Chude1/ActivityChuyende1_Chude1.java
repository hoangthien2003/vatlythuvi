package com.vatlythuvi.Baitap.Chuyende1.Chude1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;

public class ActivityChuyende1_Chude1 extends AppCompatActivity {
    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende1_chude1);

        button1 = findViewById(R.id.buttoncd1_chude1_dang1);
        button2 = findViewById(R.id.buttoncd1_chude1_dang2);
        button3 = findViewById(R.id.buttoncd1_chude1_dang3);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1_Chude1.this,
                    ActivityChuyende1_Chude1_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1_Chude1.this,
                    ActivityChuyende1_Chude1_Dang2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1_Chude1.this,
                    ActivityChuyende1_Chude1_Dang3.class);
            startActivity(intent);
        });
    }
}