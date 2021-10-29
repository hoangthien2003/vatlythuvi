package com.vatlythuvi.Baitap.Chuyende3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;
import com.vatlythuvi.Baitap.Chuyende3.Chude1.ActivityChuyende3_Chude1_Dang1;
import com.vatlythuvi.Baitap.Chuyende3.Chude1.ActivityChuyende3_Chude1_Dang2;
import com.vatlythuvi.Baitap.Chuyende3.Chude1.ActivityChuyende3_Chude1_Dang3;
import com.vatlythuvi.Baitap.Chuyende3.Chude1.ActivityChuyende3_Chude1_Dang4;
import com.vatlythuvi.Baitap.Chuyende3.Chude1.ActivityChuyende3_Chude1_Dang5;

public class ActivityChuyende3 extends AppCompatActivity {
    Button button1, button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende3);

        button1 = findViewById(R.id.buttoncd3_chude1_dang1);
        button2 = findViewById(R.id.buttoncd6_chude1_dang2);
        button3 = findViewById(R.id.buttoncd6_chude1_dang3);
        button4 = findViewById(R.id.buttoncd6_chude1_dang4);
        button5 = findViewById(R.id.buttoncd6_chude1_dang5);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende3.this,
                    ActivityChuyende3_Chude1_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende3.this,
                    ActivityChuyende3_Chude1_Dang2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende3.this,
                    ActivityChuyende3_Chude1_Dang3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende3.this,
                    ActivityChuyende3_Chude1_Dang4.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende3.this,
                    ActivityChuyende3_Chude1_Dang5.class);
            startActivity(intent);
        });
    }
}