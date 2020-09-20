package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        Button b1=(Button)findViewById(R.id.button21);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cardio.this, Burpees.class);
                startActivity(i);
            }
        });

        Button b2=(Button)findViewById(R.id.button22);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cardio.this, Mountain.class);
                startActivity(i);
            }
        });

        Button b3=(Button)findViewById(R.id.button23);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cardio.this, Jumpjacks.class);
                startActivity(i);
            }
        });

        Button b4=(Button)findViewById(R.id.button24);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cardio.this, Skipping.class);
                startActivity(i);
            }
        });

        Button b5=(Button)findViewById(R.id.button25);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cardio.this, Cycling.class);
                startActivity(i);
            }
        });
    }
}
