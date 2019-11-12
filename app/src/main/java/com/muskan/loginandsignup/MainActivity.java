package com.muskan.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.muskan.loginandsignup.adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewpager);
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new Signup(),"SignUP");
        adapter.addFragment(new Login(),"LogIN");
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);

    }
}
