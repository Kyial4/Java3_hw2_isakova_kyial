package com.geektech.java3_hw2_isakova_kyial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FivesFragment extends Fragment {

    private TextView textview5;
    private Button btnClick5;
    public final String KEY="Key1";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fives, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textview5 = view.findViewById(R.id.textview);
        btnClick5 = view.findViewById(R.id.btn_click2);
        if (getArguments() != null) {
            String val = getArguments().getString("key1");
            textview5.setText(val);
        }
        btnClick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY, textview5.getText().toString());
                FourthFragment  fragment = new FourthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();
            }
        });
    }
}