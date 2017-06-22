package com.example.a50593.srcolling;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by 50593 on 2017/6/20.
 */

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    public void phb_grxx(View view) {
        Intent intent = new Intent(MainActivity.this,XinxiActivity.class);
        MainActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
    }
    public void phb_search(View view) {
        Intent intent = new Intent(MainActivity.this,search.class);
        MainActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.tuijian:
                    Intent intent = new Intent(MainActivity.this,ZhuyeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.paihangbang:

                    return true;
                case R.id.faxian:
                    intent = new Intent(MainActivity.this,discover.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.luntan:
                    intent = new Intent(MainActivity.this,BbsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.wodeyouxi:
                    intent = new Intent(MainActivity.this,MygameActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
            }
            return false;
        }};

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return new frament_1();
                case 1:
                    return new frament_2();
                case 2:
                    return new frament_3();
                case 3:
                    return new frament_4();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "下载榜";
                case 1:
                    return "新品榜";
                case 2:
                    return "预约榜";
                case 3:
                    return "热玩榜";
            }
            return null;
        }
    }

}

