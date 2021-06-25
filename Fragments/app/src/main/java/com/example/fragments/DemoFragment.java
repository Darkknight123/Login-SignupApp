package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class DemoFragment extends Fragment {

    AndroidVersionInterface androidVersionInterface;

    @Override
    public void onAttach(@androidx.annotation.NonNull @NotNull Context context) {
        super.onAttach(context);
  try {
    androidVersionInterface =(AndroidVersionInterface) context;
    }catch (ClassCastException e){
      Log.e("ClassCastException",e.toString());
  }

    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
       View view =inflater.from(getContext()).inflate(R.layout.fragment_layout,container,false);

        ArrayAdapter <String> arrayAdapter= new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.android_version));

        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strVersionName = ((TextView)view).getText().toString();
                androidVersionInterface.onVersionItemClick(strVersionName);

            }
        });
        return view;
    }
}
