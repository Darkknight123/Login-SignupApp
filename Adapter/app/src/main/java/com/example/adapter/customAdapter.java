package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {
    private Object androidVersions = new Object();
    private Context context;
    private ArrayList<AndroidVersion>versionArrayList;
    private Object view;
    private ViewGroup viewGroup;

    public customAdapter (Context context, ArrayList<AndroidVersion> versionArrayList){
        this.context=context;
        this.versionArrayList=versionArrayList;


        androidVersions = null;
    }

    public <androidVersions> customAdapter(androidVersions) {
        return customAdapter( );
    }

    public customAdapter(MainActivity context, Object androidVersions) {
        this.context = context;
        this.androidVersions = androidVersions;
    }

    public customAdapter(MainActivity mainActivity, void androidVersions) {
    }

    public <androidVersions> Object customAdapter(androidVersions Object, androidVersions) {
        this.androidVersions = androidVersions;
        return this.androidVersions;
    }

    @Override
    public int getCount() {
        if (versionArrayList!=null&&versionArrayList.size()>0){
            return versionArrayList.size();
        }else {
            return 0;
        }

    }

    @Override
    public Object getItem(int position) {
        return versionArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.versionlistitem, viewGroup, false);
        }
       TextView txtVersionNumber= findViewById();
        TextView txtVersionName=findViewById();

        int i = 0;
        txtVersionName.setText(versionArrayList.get(i).getVersionName());
        txtVersionNumber.setText("version"+versionArrayList.get(i).getVersionNumber());
        return (View) view;
    }

    private TextView findViewById() {

        return null;
    }
}
