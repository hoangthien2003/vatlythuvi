package com.vatlythuvi.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.vatlythuvi.R;
import com.vatlythuvi.video.video1;
import com.vatlythuvi.video.video10;
import com.vatlythuvi.video.video11;
import com.vatlythuvi.video.video12;
import com.vatlythuvi.video.video2;
import com.vatlythuvi.video.video3;
import com.vatlythuvi.video.video4;
import com.vatlythuvi.video.video5;
import com.vatlythuvi.video.video6;
import com.vatlythuvi.video.video7;
import com.vatlythuvi.video.video8;
import com.vatlythuvi.video.video9;

public class th extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_th, container, false);
        ImageButton button1=view.findViewById(R.id.imgButton1);
        ImageButton button2=view.findViewById(R.id.imgButton2);
        ImageButton button3=view.findViewById(R.id.imgButton3);
        ImageButton button4=view.findViewById(R.id.imgButton4);
        ImageButton button5=view.findViewById(R.id.imgButton5);
        ImageButton button6=view.findViewById(R.id.imgButton6);
        ImageButton button7=view.findViewById(R.id.imgButton7);
        ImageButton button8=view.findViewById(R.id.imgButton8);
        ImageButton button9=view.findViewById(R.id.imgButton9);
        ImageButton button10=view.findViewById(R.id.imgButton10);
        ImageButton button11=view.findViewById(R.id.imgButton11);
        ImageButton button12=view.findViewById(R.id.imgButton12);
        button1.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video1.class);
            startActivity(a);
        });
        button2.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video2.class);
            startActivity(a);
        });
        button3.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video3.class);
            startActivity(a);
        });
        button4.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video4.class);
            startActivity(a);
        });
        button5.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video5.class);
            startActivity(a);
        });
        button6.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video6.class);
            startActivity(a);
        });
        button7.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video7.class);
            startActivity(a);
        });
        button8.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video8.class);
            startActivity(a);
        });
        button9.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video9.class);
            startActivity(a);
        });
        button10.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video10.class);
            startActivity(a);
        });
        button11.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video11.class);
            startActivity(a);
        });
        button12.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), video12.class);
            startActivity(a);
        });
        return view;
    }
}