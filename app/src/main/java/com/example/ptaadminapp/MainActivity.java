package com.example.ptaadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import static com.example.ptaadminapp.R.id.logInButtonId;

public class MainActivity extends AppCompatActivity {

    TextInputLayout usernameEditText, passwordEditText;
    Button go;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.loginUsernameId);
        passwordEditText = findViewById(R.id.loginpasswordId);
        progressBar = findViewById(R.id.progressBarId);
        go = findViewById(logInButtonId);

        progressBar.setVisibility(View.GONE);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userLogin();

            }
        });

    }

    private void userLogin() {

        String userName = usernameEditText.getEditText().getText().toString().trim();
        String password = passwordEditText.getEditText().getText().toString().trim();

        progressBar.setVisibility(View.VISIBLE);

       if (userName.equals("admin") && password.equals("1020304050")){

           Intent intent = new Intent(getApplicationContext(),userInput.class);
           startActivity(intent);

       }
       else {
           Toast.makeText(getApplicationContext(),"Enter correct credentials",Toast.LENGTH_SHORT).show();
           progressBar.setVisibility(View.GONE);
       }


    }



}
