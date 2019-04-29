package com.example.lenovo.day01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private ArrayList<Fragment> fragments;
    /**
     * 哇哇哇哇
     */
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
    }

    private void initdata() {
        fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(fragmentAdapter);
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("111111112315646416");
    }
}
