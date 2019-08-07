package com.example.belajarintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button explicitintent;
    Button impicitintent;
    Button intentlooping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitintent = (Button) findViewById(R.id.expilicitIntent);
        impicitintent = (Button) findViewById(R.id.impicitIntent);
        intentlooping = (Button) findViewById(R.id.loopingIntent);
        explicitintent.setOnClickListener(this);
        impicitintent.setOnClickListener(this);
        intentlooping.setOnClickListener(this);



    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.expilicitIntent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;

            case R.id.impicitIntent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://w3school.com"));
                startActivity(implicit);
                break;
            case R.id.loopingIntent:
                Intent looping = new Intent(MainActivity.this, IntentMerah.class);
                startActivity(looping);
                break;
            default:
                break;
        }
    }
}
