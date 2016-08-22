package com.ssuncake.uisampling;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RealtimeFragment extends Fragment {

ViewPager viewPager;
    public RealtimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_realtime, container, false);
//        viewPager  = (ViewPager)view.findViewById(R.id.viewpager_real);
//        viewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
//            @Override
//            public Fragment getItem(int position) {
//                return ;
//            }
//
//            @Override
//            public int getCount() {
//                return 0;
//            }
//        });



        return view;
        }

}
