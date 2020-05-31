package com.example.twobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    int n = 0, m = 0;
    MaterialButton countBtn1, countBtn2;
    MaterialTextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textV1);
        textView2 = findViewById(R.id.textV2);

    }

    public void addNum1(View v) {
        n++;
        textView1.setText("Количество нажатий на кнопку 1: " + n);
    }

    public void addNum2(View v) {
        m++;
        textView2.setText("Количество нажатий на кнопку 2: " + m);
    }
}
