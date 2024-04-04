package com.example.app7.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.app7.R;
import com.example.app7.Data.InformationRepository;


public class Tutor1Fragment extends Fragment {
    InformationRepository info;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        info = new InformationRepository();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutor1, container, false);
        Button button = view.findViewById(R.id.button);
        EditText editText1 = view.findViewById(R.id.editTextText);
        EditText editText2 = view.findViewById(R.id.editTextText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = editText1.getText().toString();
                String Town = editText2.getText().toString();
                info.setName(Name);
                info.setTown(Town);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Info", info);
                Navigation.findNavController(view).navigate(R.id.action_tutor1Fragment_to_tutor2Fragment, bundle);
            }
        });
        return view;
    }
}