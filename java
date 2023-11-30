package com.example.registrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextMobile, editTextAddress, editTextDOB;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextMobile = findViewById(R.id.editTextMobile);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextDOB = findViewById(R.id.editTextDOB);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();
        String mobile = editTextMobile.getText().toString();
        String address = editTextAddress.getText().toString();
        String dob = editTextDOB.getText().toString();

        String toastMessage = "Your Name is: "+"\t" + name +
                "\nYour Mobile No is : "+"\t" + mobile +
                "\nYour Email Id is : " + "\t" + email +
                "\nYour Address is : " +"\t" + address +
                "\nYour DOB is: " + dob;
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
