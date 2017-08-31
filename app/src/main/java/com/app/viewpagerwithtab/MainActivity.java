package com.app.viewpagerwithtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.viewpagerwithtab.adapter.FragmentViewPagerAdapter;
import com.app.viewpagerwithtab.fragment.ViewPagerFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private FragmentViewPagerAdapter fragmentViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialized view
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout=(TabLayout)findViewById(R.id.sliding_tabs);

        setUpAdapter();
    }

    private void setUpAdapter(){
        if(fragmentViewPagerAdapter==null){
            //Create fragment adapter
            fragmentViewPagerAdapter=new FragmentViewPagerAdapter(this,getSupportFragmentManager());
           //set view pager Adapter
            viewPager.setAdapter(fragmentViewPagerAdapter);
            //set view pager into tabs
            tabLayout.setupWithViewPager(viewPager);
        }
    }
}
