package com.example.citygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyAppIntro extends AppIntro {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Welocme to City Gym", "This app is not only for City Gym members but also for not member who can exercise with our application",
                R.drawable.citylogo, ContextCompat.getColor(getApplicationContext(),R.color.firstColor)));

        addSlide(AppIntroFragment.newInstance("What Non-City Gym members can use?", "The non City Gym members can get Full-Body Workouts,Cardio exercises and also Diet Planss .",
                R.drawable.full, ContextCompat.getColor(getApplicationContext(),R.color.secondColor)));

        addSlide(AppIntroFragment.newInstance("For City Gym memebers....", "Thes City Gym members will get the BMI reports , Step counter, detailed Workout Plans as well as Diet Plans",
                R.drawable.citylogo, ContextCompat.getColor(getApplicationContext(),R.color.thirdColor)));
        setFadeAnimation();

        sharedPreferences=getApplicationContext().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();

        if(sharedPreferences!=null){
            boolean checkShared=sharedPreferences.getBoolean("checkStated",false);

            if(checkShared==true){
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        editor.putBoolean("checkStsted",false).commit();
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        editor.putBoolean("checkStated",true).commit();
        finish();
    }

}
