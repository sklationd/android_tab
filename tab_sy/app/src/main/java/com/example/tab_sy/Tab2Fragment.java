package com.example.tab_sy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab2_fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btnTEST2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 2", Toast.LENGTH_LONG).show();
            }
        };

        btnTEST.setOnClickListener(listener);
//        btnTEST.setOnClickListener((view) -> {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 2", Toast.LENGTH_LONG).show();
//        });

        return view;
    }
}