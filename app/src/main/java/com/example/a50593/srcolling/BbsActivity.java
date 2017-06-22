package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

/**
 * Created by 50593 on 2017/6/17.
 */

public class BbsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bbs);
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs 
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_layout);
        //setSupportActionBar(toolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void lt_grxx(View view) {
        Intent intent = new Intent(BbsActivity.this,XinxiActivity.class);
        BbsActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
    }
    public void lt_lt2(View view) {
        Intent intent = new Intent(BbsActivity.this,Bbs2Activity.class);
        BbsActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
    }
    public void lt_ss(View view) {
        Intent intent = new Intent(BbsActivity.this,search.class);
        BbsActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.tuijian:
                    Intent intent = new Intent(BbsActivity.this,ZhuyeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.paihangbang:
                    intent = new Intent(BbsActivity.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.faxian:
                    intent = new Intent(BbsActivity.this,discover.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
                case R.id.luntan:

                    return true;
                case R.id.wodeyouxi:
                    intent = new Intent(BbsActivity.this,MygameActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                    return true;
            }
            return false;
        }};
}