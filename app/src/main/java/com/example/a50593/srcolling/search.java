package com.example.a50593.srcolling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
public class search extends AppCompatActivity {

    private String[] mStrs = {"纪念碑谷2", "全职高手", "饥荒", "英雄使命"};
    private SearchView mSearchView;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        mSearchView = (SearchView) findViewById(R.id.searchView);
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mStrs));
        mListView.setTextFilterEnabled(true);
        int id =mSearchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textView = (TextView) mSearchView.findViewById(id);
        textView.setTextColor(getResources().getColor(R.color.color2));
        textView.setHintTextColor(getResources().getColor(R.color.color1));
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs 



        // 设置搜索文本监听
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            // 当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)){
                    mListView.setFilterText(newText);
                }else{
                    mListView.clearTextFilter();
                }
                return false;
            }
        });
    }
}