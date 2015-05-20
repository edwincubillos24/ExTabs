package com.example.extabs;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost tabHost;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
            tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

            tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Flash"),Flash.class, null);
            tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Mujer Maravilla"),MujerMaravilla.class, null);
            tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Superman"),Superman.class, null);
    }
}

