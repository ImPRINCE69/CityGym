package com.example.citygym;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageController extends FragmentPagerAdapter {
    int tabCounts;
    public PageController(FragmentManager fm, int tabCounts) {
        super(fm);
        this.tabCounts=tabCounts;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new KetogenicDiet();
            case 1:
                return new ZoneDiet();
            case 2:
                return new AtkinsDiet();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
