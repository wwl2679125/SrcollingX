package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.yalantis.phoenix.PullToRefreshView;

/**
 * Created by 50593 on 2017/6/13.
 */

public class Bbs3Activity extends AppCompatActivity {
private PullToRefreshView mPullToRefreshView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bbs_3);
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs 
        mPullToRefreshView = (PullToRefreshView)findViewById(R.id.pull_to_refresh3);
        mPullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener(){
            @Override
            public void onRefresh(){
                mPullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mPullToRefreshView.setRefreshing(false);
                    }
                },1000);
            }
        });
    }
    public void lt3_lt2(View view) {
        Intent intent = new Intent(Bbs3Activity.this,Bbs2Activity.class);
        Bbs3Activity.this.startActivity(intent);
        overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
    }
}