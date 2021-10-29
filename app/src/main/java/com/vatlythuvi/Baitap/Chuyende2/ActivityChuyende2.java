package com.vatlythuvi.Baitap.Chuyende2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;
import com.vatlythuvi.Baitap.Chuyende2.Chude1.ActivityChuyende2_Chude1;
import com.vatlythuvi.Baitap.Chuyende2.Chude2.ActivityChuyende2_Chude2;
import com.vatlythuvi.Baitap.Chuyende2.Chude3.ActivityChuyende2_Chude3;
import com.vatlythuvi.Baitap.Chuyende2.Chude4.ActivityChuyende2_Chude4;
import com.vatlythuvi.Baitap.Chuyende2.Chude5.ActivityChuyende2_Chude5;
import com.vatlythuvi.Baitap.Chuyende2.Chude6.ActivityChuyende2_Chude6;
import com.vatlythuvi.Baitap.Chuyende2.Chude7.ActivityChuyende2_Chude7;

public class ActivityChuyende2 extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende2);

        button1 = findViewById(R.id.buttoncd2_chude1);
        button2 = findViewById(R.id.buttoncd2_chude2);
        button3 = findViewById(R.id.buttoncd2_chude3);
        button4 = findViewById(R.id.buttoncd2_chude4);
        button5 = findViewById(R.id.buttoncd2_chude5);
        button6 = findViewById(R.id.buttoncd2_chude6);
        button7 = findViewById(R.id.buttoncd2_chude7);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude4.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude5.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude6.class);
            startActivity(intent);
        });
        button7.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende2.this, ActivityChuyende2_Chude7.class);
            startActivity(intent);
        });
    }
}