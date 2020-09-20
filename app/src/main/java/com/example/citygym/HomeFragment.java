package com.example.citygym;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_exercise, container, false);

        Button b1=(Button)v.findViewById(R.id.chest);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Chest.class);
                startActivity(i);
            }
        });

        Button b2=(Button)v.findViewById(R.id.tricep);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Triceps.class);
                startActivity(i);
            }
        });

        Button b3=(Button)v.findViewById(R.id.back);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Back.class);
                startActivity(i);
            }
        });

        Button b4=(Button)v.findViewById(R.id.biceps);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Biceps.class);
                startActivity(i);
            }
        });

        Button b5=(Button)v.findViewById(R.id.leg);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Legs.class);
                startActivity(i);
            }
        });

        Button b6=(Button)v.findViewById(R.id.shoulder);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),Shoulder.class);
                startActivity(i);
            }
        });
        return v;
    }
}

