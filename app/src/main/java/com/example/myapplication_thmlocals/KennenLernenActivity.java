package com.example.myapplication_thmlocals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KennenLernenActivity extends AppCompatActivity {
private Button bttn;
private Button bttn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kennen_lernen);
        getSupportActionBar().setTitle("Zurück");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button bttn = findViewById(R.id.buttonk1);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openItemsListActivity();
            }

            public void openItemsListActivity() {
                Intent intent = new Intent(KennenLernenActivity.this, ItemsListActivityKennenlernen.class);
                startActivity(intent);
            }
        });
        Button bttn2 = findViewById(R.id.buttonk2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openItemsListActivity();
            }

            public void openItemsListActivity() {
                Intent intent = new Intent(KennenLernenActivity.this, ItemsListActivityKennenlernen.class);
                startActivity(intent);
            }
        });

    }
}
