package com.example.myapplication_thmlocals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button button2;
    private Button button3;
    private Button button4;

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //getSupportActionBar().setTitle("Welcome");

        Button button2 = findViewById(R.id.buttonk1);
        Button button3 = findViewById(R.id.buttonk2);
        Button button4 = findViewById(R.id.button4);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }
        public void openNachhilfeActivity(){
        Intent intent = new Intent(this, NachhilfeActivity.class);
        startActivity(intent);
    }
        public void openKennenActivity(){
        Intent intent = new Intent(this, KennenLernenActivity.class);
        startActivity(intent);
    }
        public void openGruppeActivity(){
        Intent intent = new Intent(this, GruppeActivity.class);
        startActivity(intent);
    }
        public void openMainActivity() {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }
        @Override
        public void onClick(View v) {
         switch (v.getId()){
             case R.id.buttonk1:
                 //Toast.makeText( this, "Nachhilfe clicked", Toast.LENGTH_SHORT).show();
                 openNachhilfeActivity();
                 break;
             case R.id.buttonk2:
                 //Toast.makeText( this, "Gruppe clicked", Toast.LENGTH_SHORT).show();
                 openGruppeActivity();
                 break;
             case R.id.button4:
                 //Toast.makeText( this, "Kennenlernen clicked", Toast.LENGTH_SHORT).show();
                 openKennenActivity();
                 break;
         }

        }



        @Override
        public void onBackPressed () {
            openMainActivity();
            /*
            if (backPressedTime + 2000 > System.currentTimeMillis()) {
                backToast.cancel();
                super.onBackPressed();
                return;
            } else {
                //backToast = Toast.makeText(getBaseContext(), "Press back again to exit ", Toast.LENGTH_SHORT);
                //backToast.show();


            }
            backPressedTime = System.currentTimeMillis(); */

        }


}



