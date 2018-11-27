package com.example.yocelin.regularizacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
     private void cambio (View view){
            Intent objI = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(objI);
     }
}

