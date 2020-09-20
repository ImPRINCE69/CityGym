package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Advance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Pull.class);
                startActivity(i);

            }
        });

        Button b2=(Button)findViewById(R.id.button131);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Diamond.class);
                startActivity(i);

            }
        });

        Button b3=(Button)findViewById(R.id.button132);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Hindu.class);
                startActivity(i);

            }
        });

        Button b4=(Button)findViewById(R.id.button133);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Incline_dumbellpress.class);
                startActivity(i);

            }
        });

        Button b5=(Button)findViewById(R.id.button134);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Lunges.class);
                startActivity(i);

            }
        });

        Button b6=(Button)findViewById(R.id.button135);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Pec_fly.class);
                startActivity(i);

            }
        });

        Button b7=(Button)findViewById(R.id.button136);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Pike.class);
                startActivity(i);

            }
        });

        Button b8=(Button)findViewById(R.id.button137);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Skipping.class);
                startActivity(i);

            }
        });

        Button b9=(Button)findViewById(R.id.button138);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Squats.class);
                startActivity(i);

            }
        });

        Button b10=(Button)findViewById(R.id.button139);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Advance.this, Widearm.class);
                startActivity(i);

            }
        });
    }
}
