package com.vatlythuvi.Baitap.Chuyende2.Chude2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;

public class ActivityChuyende2_Chude2 extends AppCompatActivity {
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende2_chude2);

        button1 = findViewById(R.id.buttoncd2_chude2_dang1);
        button2 = findViewById(R.id.buttoncd2_chude2_dang2);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende2_Chude2_Dang1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende2_Chude2_Dang2.class);
            startActivity(intent);
        });
    }
}