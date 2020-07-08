package com.example.ptaadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.file.WatchEvent;

public class userInput extends AppCompatActivity {

    Spinner spinner;
    TextInputLayout winPrize,killPrize,type,version,map;
    Button createMatch;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        databaseReference = FirebaseDatabase.getInstance().getReference("DATA");

        spinner = findViewById(R.id.entryFeeId);
        winPrize = findViewById(R.id.winPrizeId);
        killPrize = findViewById(R.id.perKillPrizeId);
        type = findViewById(R.id.gameTypeId);
        version = findViewById(R.id.gameVersionId);
        map = findViewById(R.id.gameMapId);
        createMatch = findViewById(R.id.createMatchId);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.Entry_Fee,android.R.layout.simple_spinner_item);

        spinner.setAdapter(arrayAdapter);

    }

    public void saveData(View view) {

        // String entryFee = spinner.getT
        String WINPRIZE = winPrize.getEditText().getText().toString().trim();
        String KILLPRIZE = killPrize.getEditText().getText().toString().trim();
        String TYPE = type.getEditText().getText().toString().trim();
        String VERSION = version.getEditText().getText().toString().trim();
        String MAP = map.getEditText().getText().toString().trim();


        String key = databaseReference.push().getKey();

        Data_handler handler = new Data_handler(WINPRIZE, KILLPRIZE,TYPE,VERSION,MAP);

        databaseReference.child(key).setValue(handler);

        Toast.makeText(this, "Data save succesfully", Toast.LENGTH_SHORT).show();

    }
}
