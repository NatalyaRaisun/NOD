package com.natalya.nodcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Main.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
