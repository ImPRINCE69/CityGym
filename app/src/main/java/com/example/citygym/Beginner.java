package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Beginner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        Button b1=(Button)findViewById(R.id.button111);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Beginner.this, Cobra.class);
                startActivity(i);

            }
        });

        Button b2=(Button)findViewById(R.id.button112);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Beginner.this, Jumping_Jacks.class);
                startActivity(i);

            }
        });

        Button b3=(Button)findViewById(R.id.button113);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Beginner.this, Widearm.class);
                startActivity(i);

            }
        });

        Button b4=(Button)findViewById(R.id.button114);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Beginner.this, Knee_pushups.class);
                startActivity(i);

            }
        });

        Button b5=(Button)findViewById(R.id.button115);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Beginner.this, Tricep_dips.class);
                startActivity(i);

            }
        });
    }
}
