package com.example.myapplication_thmlocals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ItemsListActivitygruppe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_listgruppe2);
        getSupportActionBar().setTitle("Zurück ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
