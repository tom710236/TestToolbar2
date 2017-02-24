package com.example.tom.testtoolbar2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        //toolbar.setSubtitle("SubTitle");
        toolbar.setLogo(R.drawable.ic_chevron_left_black_24dp);

        //设置导航图标要在setSupportActionBar方法之后
        setSupportActionBar(toolbar);


    }
}
