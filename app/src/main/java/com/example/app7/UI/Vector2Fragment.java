package com.example.app7.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.app7.R;

public class Vector2Fragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vector2, container, false);
        Button button = view.findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                // Устанавливаем пользовательские анимации
                transaction.setCustomAnimations(
                        R.animator.card_flip_right_in,
                        R.animator.card_flip_right_out,
                        R.animator.card_flip_left_in,
                        R.animator.card_flip_left_out
                );
                // Заменяем текущий фрагмент на новый фрагмент
                transaction.replace(R.id.nav_host_fragment, new VectorFragment());
                // Добавляем транзакцию в стек возврата, чтобы можно было вернуться к предыдущему фрагменту
                transaction.addToBackStack(null);
                // Применяем транзакцию
                transaction.commit();

            }
        });
        return view;
    }
}