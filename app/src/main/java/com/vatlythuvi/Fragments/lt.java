package com.vatlythuvi.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.vatlythuvi.R;
import com.vatlythuvi.c1.ltc1;
import com.vatlythuvi.c2.ltc2;
import com.vatlythuvi.c3.ltc3;
import com.vatlythuvi.c4.ltc4;
import com.vatlythuvi.c5.ltc5;
import com.vatlythuvi.c6.ltc6;
import com.vatlythuvi.c7.ltc7;

public class lt extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_lt, container, false);
        Button button1=view.findViewById(R.id.button1);
        Button button2=view.findViewById(R.id.button2);
        Button button3=view.findViewById(R.id.button3);
        Button button4=view.findViewById(R.id.button4);
        Button button5=view.findViewById(R.id.button5);
        Button button6=view.findViewById(R.id.button6);
        Button button7=view.findViewById(R.id.button7);
        button1.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc1.class);
            startActivity(a);
        });
        button2.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc2.class);
            startActivity(a);
        });
        button3.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc3.class);
            startActivity(a);
        });
        button4.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc4.class);
            startActivity(a);
        });
        button5.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc5.class);
            startActivity(a);
        });
        button6.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc6.class);
            startActivity(a);
        });
        button7.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), ltc7.class);
            startActivity(a);
        });
        return view;
    }
}