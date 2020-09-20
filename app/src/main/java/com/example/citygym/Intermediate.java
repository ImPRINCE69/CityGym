package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intermediate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        Button b1=(Button)findViewById(R.id.button121);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Incline_dumbellpress.class);
                startActivity(i);

            }
        });

        Button b2=(Button)findViewById(R.id.button122);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Jumping_squats.class);
                startActivity(i);

            }
        });

        Button b3=(Button)findViewById(R.id.button123);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Knee_pushups.class);
                startActivity(i);

            }
        });

        Button b4=(Button)findViewById(R.id.button124);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Pec_fly.class);
                startActivity(i);

            }
        });

        Button b5=(Button)findViewById(R.id.button125);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Tricep_dips.class);
                startActivity(i);

            }
        });

        Button b6=(Button)findViewById(R.id.button126);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Widearm.class);
                startActivity(i);

            }
        });

        Button b7=(Button)findViewById(R.id.button127);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intermediate.this, Pushups_rotation.class);
                startActivity(i);

            }
        });
    }
}
