package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;



public class MygameActivity extends AppCompatActivity {


    private MygameActivity.SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mygame);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mSectionsPagerAdapter = new MygameActivity.SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container2);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs2);
        tabLayout.setupWithViewPager(mViewPager);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.tuijian:
                    Intent intent = new Intent(MygameActivity.this,ZhuyeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.paihangbang:
                    intent = new Intent(MygameActivity.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.faxian:
                    intent = new Intent(MygameActivity.this,discover.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.luntan:
                    intent = new Intent(MygameActivity.this,BbsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.wodeyouxi:

                    return true;
            }
            return false;
        }};
    public void onClick_Event3(View view) {
        Intent intent = new Intent(MygameActivity.this,XinxiActivity.class);
        MygameActivity.this.startActivity(intent);
    }
    public void wdyx_ss(View view) {
        Intent intent = new Intent(MygameActivity.this,search.class);
        MygameActivity.this.startActivity(intent);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return new fragment_3();
                case 1:
                    return new fragment_4();
                case 2:
                    return new fragment_5();
                case 3:
                    return new fragment_6();
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
                    return "已装";
                case 1:
                    return "玩过";
                case 2:
                    return "收藏";
                case 3:
                    return "预约";
            }
            return null;
        }
    }


}
