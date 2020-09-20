package com.example.citygym;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.WidgetContainer;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {

    EditText txtFullname,txtUsername,txtEmail,txtPass,txtConfirm;
    Button rbtn;
    ProgressBar progressBar;
    RadioButton radioGenderMale,radioGenderFemale;
    String gender="";

    DatabaseReference databaseReference;
    FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().setTitle("Registration");
        txtFullname=(EditText)findViewById(R.id.txtFullname);
        txtUsername=(EditText)findViewById(R.id.txtUsername);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPass=(EditText)findViewById(R.id.txtPass);
        txtConfirm=(EditText)findViewById(R.id.txtConfirm);
        radioGenderMale=(RadioButton)findViewById(R.id.radio_male);
        radioGenderFemale=(RadioButton)findViewById(R.id.radio_female);

        rbtn=(Button) findViewById(R.id.rbtn);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);


        databaseReference=FirebaseDatabase.getInstance().getReference("members");

        firebaseAuth=FirebaseAuth.getInstance();



        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender="";
                final String fullName=txtFullname.getText().toString().trim();
                final String userName=txtUsername.getText().toString().trim();
                final String email=txtEmail.getText().toString().trim();
                String password=txtPass.getText().toString().trim();
                String confirmPassword =txtConfirm.getText().toString().trim();

                if(radioGenderMale.isChecked()){
                    gender="Male";
                }
                if(radioGenderFemale.isChecked()){
                    gender="Female";
                }
                if(TextUtils.isEmpty(fullName)){
                    Toast.makeText(getApplicationContext(), "Please Enter Fullname !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(userName)){
                    Toast.makeText(getApplicationContext(), "Please Enter Username !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(), "Please Enter Email !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(), "Please Enter Password !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(confirmPassword)){
                    Toast.makeText(getApplicationContext(), "Please Enter Confirm Password !",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length()<6){
                    Toast.makeText(getApplicationContext(), "Please Enter Password more than 6 letters !",Toast.LENGTH_SHORT).show();
                }

                if(password.equals(confirmPassword)) {
                    final String finalGender = gender;
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Registration.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    progressBar.setVisibility(View.GONE);

                                    if (task.isSuccessful()) {

                                        members information=new members(
                                                fullName,
                                                userName,
                                                email,
                                                finalGender
                                        );
                                        FirebaseDatabase.getInstance().getReference("members")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                Toast.makeText(Registration.this,"Registration Complete",Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(getApplicationContext(),Login.class));
                                            }
                                        });

                                    }
                                    else {
                                        Toast.makeText(Registration.this, "Please check Password and Confirm Password fields !",Toast.LENGTH_SHORT).show();
                                    }



                                }
                            });
                }

                progressBar.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.id_citygym)
        {
            Intent i = new Intent(Registration.this, Aboutus.class);
            startActivity(i);
            return true;
        }

        if(id==R.id.id_developer)
        {
            Intent i = new Intent(Registration.this, Developer.class);
            startActivity(i);
            return true;
        }

        if(id==R.id.id_share)
        {
            switch ((item.getItemId())){
                case R.id.id_share:
                    Intent sharingIntent=new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody="Your Body Here";
                    String shareSubject="Your Subject";

                    sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                    sharingIntent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);

                    startActivity(Intent.createChooser(sharingIntent,"Share Dialog"));
                    break;
            }
        }
        return true;
    }
}

