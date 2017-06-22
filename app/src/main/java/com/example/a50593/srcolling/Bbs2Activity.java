package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.yalantis.phoenix.PullToRefreshView;

/**
 * Created by 50593 on 2017/6/13.
 */

public class Bbs2Activity extends AppCompatActivity {
    private PullToRefreshView mPullToRefreshView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bbs_2);
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs 
        TextView textView= (TextView) findViewById(R.id.luntan);//或从xml导入

        TextPaint paint = textView.getPaint();

        paint.setFakeBoldText(true);//中文字加粗

        mPullToRefreshView = (PullToRefreshView)findViewById(R.id.pull_to_refresh);
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
    public void lt2_lt3(View view) {
        Intent intent = new Intent(Bbs2Activity.this,Bbs3Activity.class);
        Bbs2Activity.this.startActivity(intent);
        overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
    }
}