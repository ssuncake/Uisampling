package com.ssuncake.uisampling;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    private List<Fragment> mFragmentList;
    private int Images[] = {R.drawable.tab_realtime, R.drawable.tab_monitor, R.drawable.tab_guide, R.drawable.tab_setting,};
    private static final String TAG[] = {"TAG1", "TAG2", "TAG3", "TAG4",};
    private Class mClass[] = {RealtimeFragment.class, MonitorFragment.class, GuideFragment.class, SettingFragment.class};
    private Fragment mFragment[] = {new RealtimeFragment(), new MonitorFragment(), new GuideFragment(), new SettingFragment()};
    ImageView imageView;
    FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost) findViewById(R.id.tabHost);

        tabHost.setup(MainActivity.this, getSupportFragmentManager(), android.R.id.tabcontent);


        mFragmentList = new ArrayList<Fragment>();


        for (int i = 0; i < 4; i++) {
            TabHost.TabSpec tabSpec = tabHost.newTabSpec(TAG[i]).setIndicator(getTabWiget(i));
            tabHost.addTab(tabSpec, mClass[i], null);
            mFragmentList.add(mFragment[i]);
        }
    }

    private View getTabWiget(int index) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
        imageView = (ImageView) view.findViewById(R.id.imagev);
        imageView.setImageResource(Images[index]);
        return view;
    }


}
