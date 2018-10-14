package com.natalya.nodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class Main extends AppCompatActivity {

    private static final String LOG = "logs";
    public static final String EXTRA_MESSAGE = "com.natalya.MESSAGE";
    private static final String KEY1 = "NUM1";
    private static final String KEY2 = "NUM2";
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(LOG, "Devise rotation");
        Log.d(LOG, "num 1 = " + num1);
        Log.d(LOG, "num 2 = " + num2);
        outState.putInt(KEY1, num1);
        outState.putInt(KEY2, num2);

    }


    public void buttonClick(View v) {
        Intent intent = new Intent(Main.this, AboutActivity.class);
        startActivity(intent);

        EditText number1 = (EditText) findViewById(R.id.editText1);
        EditText number2 = (EditText) findViewById(R.id.editText2);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int resNod;

        Log.i(LOG, "Find the NOD of numbers " + num1 + " " + num2);
        int a = num1, b = num2;
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        resNod = a;
        Log.i(LOG, "NOD = " + resNod);

        String message = Integer.toString(resNod);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
