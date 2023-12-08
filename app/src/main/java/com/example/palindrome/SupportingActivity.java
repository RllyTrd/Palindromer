package com.example.palindrome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class SupportingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setPadding(25,100,0,0);
        TextView textView = new TextView(this);
        textView.setTextSize(32);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if (palindromeChecker(message)){
            textView.setText("The entered message is a palindrome!");
        } else {
            textView.setText("The entered message is not a palindrome!");
        }
        layout.addView(textView);
        setContentView(layout);
    }
    private boolean palindromeChecker(String s) {
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        for(String x: arr)
            stack.push(x);
        int count = 0;
        while(!stack.isEmpty()){
            if (!stack.pop().equals(arr[count++]))
                return false;
        }
        return true;
    }

}
