package com.example.myapplication_thmlocals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GruppeActivity extends AppCompatActivity {
private Button btnn;
private Button btnn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruppe);
        getSupportActionBar().setTitle("Zurück ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnn = findViewById(R.id.buttong1);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemsListActivity();
            }

            public void openItemsListActivity() {
                Intent intent = new Intent(GruppeActivity .this, ItemsListActivitygruppe.class);
                startActivity(intent);
            }
        });
        Button btnn2 = findViewById(R.id.buttonk2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemsListActivity();
            }

            public void openItemsListActivity() {
                Intent intent = new Intent(GruppeActivity .this, ItemsListActivitygruppe.class);
                startActivity(intent);
            }
        });
    }
}
