package com.example.palindrome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "CPTR320";
    public static final String EXTRA_MESSAGE = "cptr320.myapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputText = (EditText) findViewById(R.id.inputText);
        inputText.selectAll();
    }
    public void sendMessage(View view) {
        EditText inputText = (EditText) findViewById(R.id.inputText);
        String message = inputText.getText().toString();
        inputText.selectAll();
        Log.i(TAG,"Message is " + message);
        Intent intent = new Intent(this, SupportingActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about)
            startActivity(new Intent(this, AboutActivity.class));
        else if (id == R.id.help) {
            startActivity(new Intent(this, HelpActivity.class));
        } else
            return super.onOptionsItemSelected(item);
        return true;
    }
}