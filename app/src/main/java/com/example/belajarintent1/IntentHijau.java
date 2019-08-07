package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentHijau extends AppCompatActivity implements View.OnClickListener{

    Button intentbiru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hijau);

        intentbiru = (Button) findViewById(R.id.buttonPindah);
        intentbiru.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent biru = new Intent(IntentHijau.this,IntentBiru.class);
        startActivity(biru);
    }
}
