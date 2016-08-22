package com.ssuncake.uisampling;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragment extends Fragment {

    int MAX_PAGE=3;
    Fragment cur_fragment = new Fragment();

    ViewPager viewPager;
    ImageView img;

    public GuideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.ViewPager_Guide);
        viewPager.setAdapter(new GuideViewAdapter(getFragmentManager()));

        return  view;
    }




    public class GuideViewAdapter extends FragmentPagerAdapter {
        public GuideViewAdapter (FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position<0|| MAX_PAGE<=position)
                return null;
            switch (position){
                case 0:
                    cur_fragment = new GuidetabOneFragment();

                    break;
                case 1:
                    cur_fragment = new GuidetabTwoFragment();
                    break;
                case 2:
                    cur_fragment = new GuidetabThreeFragment();
                    break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }


}
