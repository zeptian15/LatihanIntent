package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentBiru extends AppCompatActivity implements View.OnClickListener{

    Button intentUngu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biru);

        intentUngu = (Button) findViewById(R.id.buttonPindah);
        intentUngu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent ungu = new Intent(IntentBiru.this,IntentUngu.class);
        startActivity(ungu);
    }
}
