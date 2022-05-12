package com.geektech.java3_hw2_isakova_kyial;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ThirdFragment extends Fragment {
    private TextView textview3;
    private Button btnClick3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
        textview3 = view.findViewById(R.id.textview3);
        btnClick3=  view.findViewById(R.id.btn_click3);
        if (getArguments() != null) {
            String val= getArguments().getString("key1");
            textview3.setText(val);
        }
        btnClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("key1",textview3.getText().toString());
                ThirdFragment fragment =new ThirdFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
            }
        });
    }
}