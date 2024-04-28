package com.example.app7.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.TransitionInflater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.app7.R;
import com.example.app7.Data.InformationRepository;

public class Tutor2Fragment extends Fragment {
    InformationRepository info;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutor2, container, false);
        TextView textView1 = view.findViewById(R.id.textView4);
        TextView textView2 = view.findViewById(R.id.textView6);
        Button button = view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                // Заменяем текущий фрагмент на новый фрагмент
                transaction.replace(R.id.nav_host_fragment, new VectorFragment());
                // Добавляем транзакцию в стек возврата, чтобы можно было вернуться к предыдущему фрагменту
                transaction.addToBackStack(null);
                // Применяем транзакцию
                transaction.commit();

            }
        });
//        Bundle bundle = getArguments();
//        info = (InformationRepository) getArguments().getSerializable("Info");
//        if (bundle != null) {
//            if (info != null) {
//                textView1.setText(info.getName());
//                textView2.setText(info.getTown());
//            }
//        }
        return view;
    }
}