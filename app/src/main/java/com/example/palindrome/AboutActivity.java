package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String message = getString(R.string.about_info);
        LinearLayout layout = new LinearLayout(this);
        layout.setPadding(25,100,0,0);
        TextView textView = new TextView(this);
        textView.setTextSize(16);
        textView.setText(message);
        layout.addView(textView);
        setContentView(layout);
    }
}