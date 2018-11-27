package com.example.yocelin.regularizacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    private void cambio2 (View view){
        Intent objI = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(objI);
    }
}
