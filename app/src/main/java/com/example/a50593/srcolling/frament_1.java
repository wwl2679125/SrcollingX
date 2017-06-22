package com.example.a50593.srcolling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class frament_1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View a=inflater.inflate(R.layout.frament_1, null);

        ImageView iv=(ImageView)a.findViewById(R.id.a11);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ScrollingActivity.class);
                frament_1.this.startActivity(intent);

            }
        });
        return a;
    }


}