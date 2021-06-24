package com.example.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class DemoFragment extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
       View view =inflater.from(getContext()).inflate(R.layout.fragment_layout,container,false);

        ArrayAdapter <String> arrayAdapter= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.android_version));

        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}
