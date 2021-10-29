package com.vatlythuvi.Baitap.Chuyende5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;
import com.vatlythuvi.Baitap.Chuyende5.Chude1.ActivityChuyende5_Chude1_Dang1;
import com.vatlythuvi.Baitap.Chuyende5.Chude1.ActivityChuyende5_Chude1_Dang2;
import com.vatlythuvi.Baitap.Chuyende5.Chude1.ActivityChuyende5_Chude1_Dang3;

public class ActivityChuyende5 extends AppCompatActivity {
    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende5);

        button1 = findViewById(R.id.buttoncd5_chude1_dang1);
        button2 = findViewById(R.id.buttoncd5_chude1_dang2);
        button3 = findViewById(R.id.buttoncd5_chude1_dang3);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende5.this,
                    ActivityChuyende5_Chude1_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende5.this,
                    ActivityChuyende5_Chude1_Dang2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityChuyende5.this,
                    ActivityChuyende5_Chude1_Dang3.class);
            startActivity(intent);
        });
    }
}