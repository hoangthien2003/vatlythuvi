package com.vatlythuvi.Baitap.Chuyende1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;
import com.vatlythuvi.Baitap.Chuyende1.Chude1.ActivityChuyende1_Chude1;
import com.vatlythuvi.Baitap.Chuyende1.Chude2.ActivityChuyende1_Chude2;
import com.vatlythuvi.Baitap.Chuyende1.Chude3.ActivityChuyende1_Chude3;
import com.vatlythuvi.Baitap.Chuyende1.Chude4.ActivityChuyende1_Chude4;
import com.vatlythuvi.Baitap.Chuyende1.Chude5.ActivityChuyende1_Chude5;

public class ActivityChuyende1 extends AppCompatActivity {
    Button button1, button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende1);

        button1 = findViewById(R.id.buttoncd1_chude1);
        button2 = findViewById(R.id.buttoncd1_chude2);
        button3 = findViewById(R.id.buttoncd1_chude3);
        button4 = findViewById(R.id.buttoncd1_chude4);
        button5 = findViewById(R.id.buttoncd1_chude5);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1.this, ActivityChuyende1_Chude1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1.this, ActivityChuyende1_Chude2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1.this, ActivityChuyende1_Chude3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1.this, ActivityChuyende1_Chude4.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende1.this, ActivityChuyende1_Chude5.class);
            startActivity(intent);
        });
    }
}