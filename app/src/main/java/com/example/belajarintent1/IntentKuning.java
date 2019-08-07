package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentKuning extends AppCompatActivity implements View.OnClickListener{

    Button intentHijau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kuning);

        intentHijau = (Button) findViewById(R.id.buttonPindah);
        intentHijau.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent hijau = new Intent(IntentKuning.this,IntentHijau.class);
        startActivity(hijau);
    }
}
