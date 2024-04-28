package com.example.app7.UI;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.app7.Data.InformationRepository;
import com.example.app7.R;

public class StartFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TransitionInflater inflater =
                TransitionInflater.from(requireContext());
        setExitTransition(inflater.inflateTransition(R.transition.fade
        ));

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);

        Button button1 = view.findViewById(R.id.IamStudentButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем экземпляр фрагмента Student1Fragment
                Student1Fragment student1Fragment = new Student1Fragment();
                // Получаем менеджер транзакций
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                // Заменяем текущий фрагмент на Student1Fragment
                transaction.replace(R.id.nav_host_fragment, student1Fragment);
                // Добавляем транзакцию в стек возврата
                transaction.addToBackStack(null);
                // Применяем транзакцию
                transaction.commit();
            }
        });

        Button button2 = view.findViewById(R.id.IamTutorButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем экземпляр фрагмента Tutor1Fragment
                Tutor1Fragment tutor1Fragment = new Tutor1Fragment();
                // Получаем менеджер транзакций
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                // Заменяем текущий фрагмент на Tutor1Fragment
                transaction.replace(R.id.nav_host_fragment, tutor1Fragment);
                // Добавляем транзакцию в стек возврата
                transaction.addToBackStack(null);
                // Применяем транзакцию
                transaction.commit();
            }
        });

        return view;
    }
}
