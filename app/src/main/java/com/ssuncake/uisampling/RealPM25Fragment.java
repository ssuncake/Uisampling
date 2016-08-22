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
public class RealPM25Fragment extends Fragment {
ImageView imageview;

    private ViewGroup graphView;


    public RealPM25Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_real_pm25, container, false);
        imageview = (ImageView) view.findViewById(R.id.imageView);
        imageview.setImageResource(R.drawable.button);

        return view;
    }



}
