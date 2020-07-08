package com.example.ptaadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class SingupActivity extends AppCompatActivity {

    TextInputLayout fullNameEditText,userNameEditText, emailEditText, passwordEditText;
    Button singUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);


        fullNameEditText = findViewById(R.id.RegisterfullnameId);
        userNameEditText = findViewById(R.id.userNameId);
        emailEditText = findViewById(R.id.RegisterEmailId);
        passwordEditText = findViewById(R.id.RegisterpasswordId);

        singUpButton = findViewById(R.id.registrationId);

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userRegistration();
            }
        });

    }

    private void userRegistration() {

        String fullName = fullNameEditText.getEditText().getText().toString().trim();
        String userName = userNameEditText.getEditText().getText().toString().trim();
        String email = emailEditText.getEditText().getText().toString().trim();
        String password = passwordEditText.getEditText().getText().toString().trim();


        //checking the validity of fullName

        if (fullName.isEmpty()){
            fullNameEditText.setError("Enter full name here");
            fullNameEditText.requestFocus();
            return;
        }

        //checking the validity of username
        if (userName.isEmpty()){
            userNameEditText.setError("Enter your username here");
            userNameEditText.requestFocus();
            return;
        }
        //checking the validity of email
        if (email.isEmpty()){
            emailEditText.setError("Enter your email address");
            emailEditText.requestFocus();
            return;
        }
        //checking the validity of email
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Enter a valid email");
            emailEditText.requestFocus();
            return;
        }
        //checking the validity of password
        if (password.isEmpty()){
            passwordEditText.setError("Enter your password");
            passwordEditText.requestFocus();
            return;
        }
        //checking the validity of password
        if (!validate_password.PATTERN_PASSWORD.matcher(password).matches()){
            passwordEditText.setError("Your password is too weak, You can Use @#$%*& To Make Strong");
            passwordEditText.requestFocus();
            return;
        }


    }

    public void singin(View view) {

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
