package com.example.citygym;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    Button login,regis,forgotpwd,admin;
    EditText ed1,ed2;
    RelativeLayout rellay1, rellay2;
    Handler handler = new Handler();
    private FirebaseAuth firebaseAuth;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        login=(Button)findViewById(R.id.login);
        firebaseAuth=FirebaseAuth.getInstance();

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);
        handler.postDelayed(runnable, 2000);

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
                if(password.length()<6){
                    Toast.makeText(getApplicationContext(), "Please Enter Password more than 6 letters !",Toast.LENGTH_SHORT).show();
                }

                firebaseAuth.signInWithEmailAndPassword(username, password)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    startActivity(new Intent(getApplicationContext(),CityExercise.class));
                                    Toast.makeText(Login.this, "Login Complete!",Toast.LENGTH_SHORT).show();
                                } else
                                    {
                                        Toast.makeText(Login.this, "Please check Password and Confirm Password fields !",Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            }
        });

        regis=(Button)findViewById(R.id.regis);
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Registration.class);
                startActivity(i);
            }
        });

        forgotpwd=(Button)findViewById(R.id.forgotpwd);
        forgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, ForgotPassword.class);
                startActivity(i);
            }
        });

        admin=(Button)findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Adminlogin.class);
                startActivity(i);
            }
        });
    }
}
