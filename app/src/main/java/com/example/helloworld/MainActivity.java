package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

        Button addBtn = (Button) findViewById((R.id.addButton));
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.firstNum);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
    }







}
