package com.example.myapplication_thmlocals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ItemsListActivityKennenlernen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list_kennenlernen);
        getSupportActionBar().setTitle("Zurück ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
