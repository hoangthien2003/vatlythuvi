package com.vatlythuvi.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.vatlythuvi.Baitap.Chuyende1.ActivityChuyende1;
import com.vatlythuvi.Baitap.Chuyende2.ActivityChuyende2;
import com.vatlythuvi.Baitap.Chuyende3.ActivityChuyende3;
import com.vatlythuvi.Baitap.Chuyende4.ActivityChuyende4;
import com.vatlythuvi.Baitap.Chuyende5.ActivityChuyende5;
import com.vatlythuvi.Baitap.Chuyende6.ActivityChuyende6;
import com.vatlythuvi.R;

public class bt extends Fragment {

    Button button, button2, button3, button4, button5, button6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bt, container, false);
        button = view.findViewById(R.id.button);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende1.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende2.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende4.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende5.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ActivityChuyende6.class);
            startActivity(intent);
        });
        return view;
    }
}