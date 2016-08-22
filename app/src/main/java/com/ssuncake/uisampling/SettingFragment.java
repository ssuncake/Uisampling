package com.ssuncake.uisampling;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

        ArrayList<String> items = new ArrayList<String>();

    public SettingFragment() {
    }
    String[] sitems = {"등록 기기 관리","페어링 끊기","모니터링 시작", "연결기기 데이터 다운로드","LED ON/OFF", "정보(앱버전/고객센터)", "사용법", "초기화"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        for(int i = 0; i<8;i++){
            items.add(sitems[i]);
        }
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, items);

        ListView list = (ListView) view.findViewById(R.id.listView);
        list.setAdapter(adapter);
        return view;
    }

}
