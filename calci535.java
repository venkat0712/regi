calci535.java



package com.example.calci535;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.n1);
        number2 = findViewById(R.id.n2);
        addButton = findViewById(R.id.a);
        subtractButton = findViewById(R.id.s);
        multiplyButton = findViewById(R.id.m);
        divideButton = findViewById(R.id.d);
        result = findViewById(R.id.r);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput()) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 + num2;
                    result.setText("Result: " + res);
                }
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput()) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 - num2;
                    result.setText("Result: " + res);
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput()) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 * num2;
                    result.setText("Result: " + res);
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput() && !number2.getText().toString().equals("0")) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 / num2;
                    result.setText("Result: " + res);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a non-zero value for number2", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateInput() {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
