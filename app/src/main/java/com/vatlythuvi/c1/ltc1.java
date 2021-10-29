package com.vatlythuvi.c1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.vatlythuvi.CustomProgressDialog;
import com.vatlythuvi.R;

public class ltc1 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.ltc1);

        CustomProgressDialog dialog = new CustomProgressDialog(ltc1.this);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        Button b3=findViewById(R.id.b3);
        Button b4=findViewById(R.id.b4);
        Button b5=findViewById(R.id.b5);
        Button b6=findViewById(R.id.b6);
        Button b7=findViewById(R.id.b7);
        b1.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b1.class);
                }
            }, 2000);
        });
        b2.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b2.class);
                }
            }, 2000);
        });
        b3.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b3.class);
                }
            }, 2000);
        });
        b4.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b4.class);
                }
            }, 2000);
        });
        b5.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b5.class);
                }
            }, 2000);
        });
        b6.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b6.class);
                }
            }, 2000);
        });
        b7.setOnClickListener(v -> {
            dialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    dialog.dismiss();
                    startActivity(com.vatlythuvi.c1.b7.class);
                }
            }, 2000);
        });
    }
    private void startActivity(Class<?> cls)
    {
        Intent intent=new Intent(this,cls);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
