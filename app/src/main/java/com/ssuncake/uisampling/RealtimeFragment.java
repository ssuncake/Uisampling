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
public class RealtimeFragment extends Fragment {
    int MAX_PAGE=3;
    Fragment cur_fragment = new Fragment();

    ViewPager viewPager;


    private ImageView[] imageDot;


    public RealtimeFragment() {
        // Required empty public constructor
    }
    public class adapter extends FragmentPagerAdapter{
        public adapter (FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position<0|| MAX_PAGE<=position)
            return null;
            switch (position){
                case 0:
                    cur_fragment = new Realtime_main_Fragment();
                    break;
                case 1:
                    cur_fragment = new RealChildTabFragment();
                    break;
                case 2:
                    cur_fragment = new RealThirdTabFragment();
                    break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_realtime, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager_real);
        viewPager.setAdapter(new adapter(getFragmentManager()));


        return view;
    }
}
