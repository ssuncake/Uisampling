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
public class Realtime_main_Fragment extends Fragment {
    ImageView imageView;

    public Realtime_main_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_realtime_main_, container, false);
        imageView = (ImageView)view.findViewById(R.id.imageView_realMain);
        return view;
    }

}
