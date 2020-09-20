package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Button b1=(Button)findViewById(R.id.instagram);
    }

    public void cityinsta(View v)
    {
        Uri u=Uri.parse("https://www.instagram.com/city__gym_/");
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
}
