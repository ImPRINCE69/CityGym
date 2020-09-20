package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Adminlogin extends AppCompatActivity {

    Button login,forgotpwd;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);

        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=ed1.getText().toString().trim();
                String password=ed2.getText().toString().trim();

                if(TextUtils.isEmpty(username)){
                    Toast.makeText(getApplicationContext(), "Please Enter Username !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(), "Please Enter Password !",Toast.LENGTH_SHORT).show();
                    return;
                }


                if(username.equals("Admin")&& password.equals("1234"))
                {
                    Intent i=new Intent(Adminlogin.this,Admin.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Sorry You are not Admin",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Adminlogin.this,Login.class);
                    startActivity(i);
                }
            }
        });

    }
}
