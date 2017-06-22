package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;




public class ZhuyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void onClick_Event2(View view) {
        Intent intent = new Intent(ZhuyeActivity.this,XinxiActivity.class);
        ZhuyeActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    public void yxtj_ss(View view) {
        Intent intent = new Intent(ZhuyeActivity.this,search.class);
        ZhuyeActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }
    public void yxtj_yx(View view) {
        Intent intent = new Intent(ZhuyeActivity.this,ScrollingActivity.class);
        ZhuyeActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.tuijian:

                return true;
            case R.id.paihangbang:
                Intent intent = new Intent(ZhuyeActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                return true;
            case R.id.faxian:
                intent = new Intent(ZhuyeActivity.this,discover.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                return true;
            case R.id.luntan:
                intent = new Intent(ZhuyeActivity.this,BbsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                return true;
            case R.id.wodeyouxi:
                intent = new Intent(ZhuyeActivity.this,MygameActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                return true;
        }
        return false;
    }};
}
