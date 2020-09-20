package com.example.citygym;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Diet extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem tabKeto;
    TabItem tabZone;
    TabItem tabAtkins;
    ViewPager viewPager;
    PageController pageController;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Diet Plans");

        tabLayout=findViewById(R.id.tablayout);
        tabKeto=findViewById(R.id.tabKeto);
        tabZone=findViewById(R.id.tabZone);
        tabAtkins=findViewById(R.id.tabAtkins);
        viewPager=findViewById(R.id.viewPager);

        pageController=new PageController(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageController);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }
}


