package com.vatlythuvi.Baitap.Chuyende1.Chude5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vatlythuvi.R;

public class ActivityChuyende1_Chude5 extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyende1_chude5);

        button1 = findViewById(R.id.buttoncd1_chude5_dang1);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this,
                    ActivityChuyende1_Chude5_Dang1.class);
            startActivity(intent);
        });
    }
}