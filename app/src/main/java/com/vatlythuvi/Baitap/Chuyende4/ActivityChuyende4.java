package com.vatlythuvi.Baitap.Chuyende4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang1;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang2;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang3;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang4;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang5;
import com.vatlythuvi.Baitap.Chuyende4.Chude1.ActivityChuyende4_Chude1_Dang6;

public class ActivityChuyende4 extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende4);

        button1 = findViewById(R.id.buttoncd4_chude1_dang1);
        button2 = findViewById(R.id.buttoncd4_chude1_dang2);
        button3 = findViewById(R.id.buttoncd4_chude1_dang3);
        button4 = findViewById(R.id.buttoncd4_chude1_dang4);
        button5 = findViewById(R.id.buttoncd4_chude1_dang5);
        button6 = findViewById(R.id.buttoncd4_chude1_dang6);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang4.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang5.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende4.this,
                    ActivityChuyende4_Chude1_Dang6.class);
            startActivity(intent);
        });
    }
}