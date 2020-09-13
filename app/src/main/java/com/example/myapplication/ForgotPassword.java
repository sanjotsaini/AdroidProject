package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ForgotPassword extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2;
    public PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tab1 = (TabItem) findViewById(R.id.tab1);
        tab1 = (TabItem) findViewById(R.id.tab2);
        viewPager = findViewById(R.id.viewPager);





        pagerAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() ==0) {
                    pagerAdapter.notifyDataSetChanged();
                }
                    else if (tab.getPosition() ==1){
                        pagerAdapter.notifyDataSetChanged();
                    }


                       Button rememberbutton = (Button) findViewById(R.id.rememberButton);

        rememberbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView rememberMessage = (TextView) findViewById(R.id.rememberMessageText);
                EditText rememberEmail = (EditText) findViewById(R.id.rememberEmailAddress);

                 if(rememberEmail.getText().toString().equals("sainisanjot26@gmail.com")){
                     rememberMessage.setText("Your password is '123456'");
                     rememberMessage.setVisibility(View.VISIBLE);
                 }
                 else{

                     rememberMessage.setText("Your Email Address in Incorrect");
                     rememberMessage.setVisibility(View.VISIBLE);
                 }

            }
        });
                }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener((new TabLayout.TabLayoutOnPageChangeListener(tabLayout)));
    }
}