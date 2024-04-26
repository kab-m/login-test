package com.example.csdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void fakeLogin() {
        EditText emailEditText = findViewById(R.id.email);
        EditText passwordEditText = findViewById(R.id.password);
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Hardcoded email and password values for testing
        String validEmail = "test@example.com";
        String validPassword = "password123";

        if (email.equals(validEmail) && password.equals(validPassword)) {
            // Successful login
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            // Proceed to next activity or perform desired action
        } else {
            // Invalid credentials
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }

}