package com.example.app7.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.app7.R;
import com.example.app7.Data.InformationRepository;

public class Student2Fragment extends Fragment {
    InformationRepository info;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student2, container, false);
        TextView textView1 = view.findViewById(R.id.textView4);
        TextView textView2 = view.findViewById(R.id.textView6);
        info = (InformationRepository) getArguments().getSerializable("Info");
        Bundle bundle = getArguments();
        if (bundle != null) {
            if (info != null) {
                textView1.setText(info.getName());
                textView2.setText(info.getTown());
            }
        }
        return view;
    }
}
