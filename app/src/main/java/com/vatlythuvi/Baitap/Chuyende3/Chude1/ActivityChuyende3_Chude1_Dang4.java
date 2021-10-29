package com.vatlythuvi.Baitap.Chuyende3.Chude1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.vatlythuvi.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

public class ActivityChuyende3_Chude1_Dang4 extends AppCompatActivity {
    RadioButton radioButton, radioButton2, radioButton3, radioButton4;
    ImageView imageView;
    TextView textView;
    ImageButton prev_button, next_button;
    Button check_btn;
    int count = 1; String answer;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);

        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        prev_button = findViewById(R.id.btnPrev);
        next_button = findViewById(R.id.btnNext);
        check_btn = findViewById(R.id.btnCheck);

        updateQues();
        checkAns();
        prev_button.setOnClickListener(v -> {
            textView.setText("");
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            radioButton4.setChecked(false);
            if (count > 1) {
                count--;
                updateQues();
            }
        });
        next_button.setOnClickListener(v -> {
            textView.setText("");
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            radioButton4.setChecked(false);
            if (count < 10) {
                count++;
                updateQues();
            }
        });
    }

    protected void updateQues() {
        DocumentReference docRef = db.collection("vatly10_3_1_4")
                .document(String.valueOf(count));
        docRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                assert document != null;
                if (document.exists()) {
                    Picasso.with(this)
                            .load(document.getString("image"))
                            .into(imageView);
                    answer = document.getString("ans");
                    checkAns();
                }
            }
        });
    }

    void checkAns() {
        check_btn.setOnClickListener(v -> {
            if (answer.equals("A")) {
                if (radioButton.isChecked())
                    textView.setText("Correct ^^");
                if (radioButton2.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton3.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton4.isChecked())
                    textView.setText("Wrong !!");
            }
            if (answer.equals("B")) {
                if (radioButton2.isChecked())
                    textView.setText("Correct ^^");
                if (radioButton.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton3.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton4.isChecked())
                    textView.setText("Wrong !!");
            }
            if (answer.equals("C")) {
                if (radioButton3.isChecked())
                    textView.setText("Correct ^^");
                if (radioButton2.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton4.isChecked())
                    textView.setText("Wrong !!");
            }
            if (answer.equals("D")) {
                if (radioButton4.isChecked())
                    textView.setText("Correct ^^");
                if (radioButton2.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton3.isChecked())
                    textView.setText("Wrong !!");
                if (radioButton.isChecked())
                    textView.setText("Wrong !!");
            }
        });
    }
}