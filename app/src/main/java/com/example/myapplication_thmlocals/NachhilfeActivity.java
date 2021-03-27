package com.example.myapplication_thmlocals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NachhilfeActivity extends AppCompatActivity   {
    private Button btn;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nachhilfe);
        getSupportActionBar().setTitle("Zurück*");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn = findViewById(R.id.buttonk1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemsListActivityNachhilfe();
            }

            public void openItemsListActivityNachhilfe() {
                Intent intent = new Intent(NachhilfeActivity.this, ItemsListActivityNachhilfe.class);
                startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.buttonk2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemsListActivityNachhilfe();
            }

            public void openItemsListActivityNachhilfe() {
                Intent intent = new Intent(NachhilfeActivity.this, ItemsListActivityNachhilfe.class);
                startActivity(intent);
            }
        });
    }


        }







