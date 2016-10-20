package com.example.admin.w1d3excercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LOG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void powerTwo(View view) {
        Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show();
        EditText editText = (EditText) findViewById(R.id.textViewMain);
        int a = Integer.parseInt(editText.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        Log.d(TAG, "powerTwo: putting extra");
        intent.putExtra("power",a*a);
        startActivity(intent);
    }

    public void powerThree(View view) {
        EditText editText = (EditText) findViewById(R.id.textViewMain);
        int a = Integer.parseInt(editText.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("power",a*a*a);
        startActivity(intent);
    }

    public void powerFour(View view) {
        EditText editText = (EditText) findViewById(R.id.textViewMain);
        int a = Integer.parseInt(editText.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("power",a*a*a*a);
        startActivity(intent);
    }
}
