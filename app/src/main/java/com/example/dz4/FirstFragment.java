package com.example.dz4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private ArrayList<ItemModel> list= new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.add(new ItemModel("Лагман","120сом",R.drawable.www));
        list.add(new ItemModel("Курдак","140сом",R.drawable.kurdak));
        list.add(new ItemModel("Суйру лагман","130сом",R.drawable.lagman));
        list.add(new ItemModel("Плов","140сом",R.drawable.plov));
        list.add(new ItemModel("Манты","130сщм",R.drawable.manty));
        list.add(new ItemModel("Дымдама","150сом",R.drawable.dymdama));
        list.add(new ItemModel("Вареники","140сом",R.drawable.vareniki));
        list.add(new ItemModel("Оромо","130 сом",R.drawable.oromo));
        list.add(new ItemModel("Картошка","110 сом",R.drawable.kartoshka));
        list.add(new ItemModel("Доширак Пицца","130сом",R.drawable.dohirak));
        list.add(new ItemModel("Рамен","150сом",R.drawable.ramen));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        LinearLayoutManager layoutManager =  new LinearLayoutManager(getContext());
        RecyclerView myList = (RecyclerView) view.findViewById(R.id.rv);
        myList.setLayoutManager(layoutManager);
        MainAdapter adapter = new MainAdapter(list);
        myList.setAdapter(adapter);
    }
}