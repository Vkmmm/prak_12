package com.example.app7.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.app7.APIData;
import com.example.app7.R;
import com.example.app7.Data.InformationRepository;


public class Student1Fragment extends Fragment {
    InformationRepository info;
    public Student1Fragment() {
        super(R.layout.fragment_student1);
        info = new InformationRepository();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student1, container, false);
        EditText group = view.findViewById(R.id.edit_group);
        EditText name = view.findViewById(R.id.editT_name);
        EditText id = view.findViewById(R.id.edit_ID);
        Button upload = view.findViewById(R.id.button_upload);
        Button get = view.findViewById(R.id.button_get);
        Button delete = view.findViewById(R.id.button_delete);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APIData.addDataToApi(id.getText().toString(), name.getText().toString(), group.getText().toString());
            }
        });
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APIData.getDataFromApi();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APIData.deleteDataFromApi(Integer.parseInt(id.getText().toString()));
            }
        });
        return view;
    }
}