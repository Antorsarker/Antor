package com.example.user.mylife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countrynames;
    int[] flags;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] countrynames,int[]flags){

        this.context=context;
        this.countrynames=countrynames;
        this.flags=flags;

    }


    @Override
    public int getCount() {
        return countrynames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
           convertView= inflater.inflate(R.layout.sample_view,parent,false);


        }
        ImageView imageView=convertView.findViewById(R.id.imageviewID);
        TextView textView=convertView.findViewById(R.id.countrytextviewID);


        imageView.setImageResource(flags[position]);
        textView.setText(countrynames[position]);


        return convertView;
    }
}
