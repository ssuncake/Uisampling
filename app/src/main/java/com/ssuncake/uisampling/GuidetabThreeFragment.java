package com.ssuncake.uisampling;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GuidetabThreeFragment extends Fragment {

    ImageView imageView;
    public GuidetabThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_guidetab_three, container, false);
        imageView = (ImageView)view.findViewById(R.id.imageview_guide_ttt);
        return view;
    }

}
