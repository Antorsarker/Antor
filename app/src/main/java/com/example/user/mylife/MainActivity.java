package com.example.user.mylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countrynames;
    private int[]flags={R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.nepal,R.drawable.pakistan,R.drawable.sri_lanka

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= this.<ListView>findViewById(R.id.listviewID);
        countrynames=getResources().getStringArray(R.array.country_names);
        CustomAdapter adapter=new CustomAdapter(this,countrynames,flags);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=countrynames[position];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                ///hoba change
            }
        });

    }
}
