package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class discover extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dicover);
        Toolbar toolbar = (Toolbar) findViewById(R.id.discover_toolbar);
        setSupportActionBar(toolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void fx_grxx(View view) {
        Intent intent = new Intent(discover.this,XinxiActivity.class);
        discover.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
    }
    public void fx_yx(View view) {
        Intent intent = new Intent(discover.this,ScrollingActivity.class);
        discover.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
    }
    public void fx_search(View view) {
        Intent intent = new Intent(discover.this,search.class);
        discover.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.tuijian:
                    Intent intent = new Intent(discover.this,ZhuyeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.paihangbang:
                    intent = new Intent(discover.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.faxian:

                    return true;
                case R.id.luntan:
                    intent = new Intent(discover.this,BbsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.wodeyouxi:
                    intent = new Intent(discover.this,MygameActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
            }
            return false;
        }};

}
