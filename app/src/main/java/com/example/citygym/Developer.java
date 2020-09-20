package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        Button b1=(Button)findViewById(R.id.insta);
        Button b2=(Button)findViewById(R.id.fb);
        Button b3 =(Button)findViewById(R.id.link);
    }

    public void insta(View v)
    {
        Uri u=Uri.parse("https://www.instagram.com/prince___694/?hl=en");
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }

    public void fb(View v)
    {
        Uri u=Uri.parse("https://m.facebook.com/profile.php?id=100004851180609&ref=content_filter");
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }

    public void link(View v)
    {
        Uri u=Uri.parse("https://www.linkedin.com/in/chirag-prajapati-1bb788191/");
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
}
