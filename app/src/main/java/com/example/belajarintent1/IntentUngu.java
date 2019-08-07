package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentUngu extends AppCompatActivity implements View.OnClickListener{

    Button intentMerah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ungu);

        intentMerah = (Button) findViewById(R.id.buttonPindah);
        intentMerah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent home = new Intent(IntentUngu.this, MainActivity.class);
        startActivity(home);
    }
}
