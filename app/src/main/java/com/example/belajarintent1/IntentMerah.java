package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentMerah extends AppCompatActivity implements View.OnClickListener{

    Button intentKuning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merah);

        intentKuning = (Button) findViewById(R.id.buttonPindah);
        intentKuning.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent kuning = new Intent(IntentMerah.this,IntentKuning.class);
        startActivity(kuning);
    }
}
